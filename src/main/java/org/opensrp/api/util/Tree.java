package org.opensrp.api.util;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Tree<K, T> implements Serializable {

    Map<K, TreeNode<K, T>> map;

    Map<K, Set<K>> parentChildren;

    public Tree() {
        map = new LinkedHashMap<K, TreeNode<K, T>>();
        parentChildren = new LinkedHashMap<>();
    }

    public Map<K, TreeNode<K, T>> getTree() {
        return Collections.unmodifiableMap(map);
    }

    public Map<K, Set<K>> getChildParent() {
        return Collections.unmodifiableMap(parentChildren);
    }

    private void addToParentChildRelation(K parent, K id) {
        if (parentChildren == null) {
            parentChildren = new LinkedHashMap<>();
        }

        Set<K> kids = parentChildren.get(parent);
        if (kids == null) {
            kids = new LinkedHashSet<>();
        }

        kids.add(id);
        parentChildren.put(parent, kids);
    }

    public void addNode(K id, String label, T node, K parentId) {
        if (map == null) {
            map = new LinkedHashMap<>();
        }

        // if node exists we should break since user should write optimized code and also tree can not have duplicates
        if (hasNode(id)) {
            throw new IllegalArgumentException("Node with ID " + id + " already exists in tree");
        }

        TreeNode<K, T> n = makeNode(id, label, node, parentId);

        if (parentId != null) {
            addToParentChildRelation(parentId, id);

            TreeNode<K, T> p = getNode(parentId);

            //if parent exists add to it otherwise add as root for now
            if (p != null) {
                p.addChild(n);
            } else {
                // if no parent exists add it as root node
                map.put(id, n);
            }
        } else {
            // if no parent add it as root node
            map.put(id, n);
        }

        Set<K> kids = parentChildren.get(id);
        // move all its child nodes preexisting
        if (kids != null) {
            for (K kid : kids) {
                //remove node from it current position and move to parent i.e. node currently being added
                TreeNode<K, T> kn = removeNode(kid);
                n.addChild(kn);
            }
        }
    }

    private TreeNode<K, T> makeNode(K id, String label, T node, K parentId) {
        TreeNode<K, T> n = getNode(id);
        if (n == null) {
            n = new TreeNode<K, T>(id, label, node, parentId);
        }
        return n;
    }

    public TreeNode<K, T> getNode(K id) {
        // Check if id is any root node
        if (map.containsKey(id)) {
            return map.get(id);
        }

        // neither root itself nor parent of root
        for (TreeNode<K, T> root : map.values()) {
            TreeNode<K, T> n = root.findChild(id);
            if (n != null)
                return n;
        }
        return null;
    }

    TreeNode<K, T> removeNode(K id) {
        // Check if id is any root node
        if (map.containsKey(id)) {
            return map.remove(id);
        }
        // neither root itself nor parent of root
        for (TreeNode<K, T> root : map.values()) {
            TreeNode<K, T> n = root.removeChild(id);
            if (n != null) {
                return n;
            }
        }
        return null;
    }

    public boolean hasNode(K id) {
        return getNode(id) != null;
    }
}
