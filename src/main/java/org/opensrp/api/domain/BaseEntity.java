package org.opensrp.api.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * The BaseEntity is the parent entity that contains basic information for all other business
 * entities. The class generalizes the identifiers, addresses, and attributes for other entities.
 * The class is the generic representation of all other business entities those have different
 * business roles in system. For example: A user in system can also be data provider. The
 * {@link User} would have basic data into {@link BaseEntity} and specific information in
 * {@link User}. The {@link BaseEntity} would also be referred by {@link Provider} to represent and
 * link roles. This helps in getting reports for any dimension for any entity into the system.
 */
public class BaseEntity extends BaseDataObject {

    private String baseEntityId;

    private Map<String, String> identifiers;

    private List<Address> addresses;

    private Map<String, Object> attributes;

    protected BaseEntity() {
    }

    public BaseEntity(String baseEntityId) {
        this.baseEntityId = baseEntityId;
    }

    public BaseEntity(String baseEntityId, Map<String, String> identifiers) {
        this.baseEntityId = baseEntityId;
        this.identifiers = identifiers;
    }

    public BaseEntity(String baseEntityId, Map<String, String> identifiers, Map<String, Object> attributes) {
        this.baseEntityId = baseEntityId;
        this.identifiers = identifiers;
        this.attributes = attributes;
    }

    public BaseEntity(String baseEntityId, Map<String, String> identifiers, Map<String, Object> attributes,
                      List<Address> addresses) {
        this.baseEntityId = baseEntityId;
        this.identifiers = identifiers;
        this.attributes = attributes;
        this.addresses = addresses;
    }

    public String getBaseEntityId() {
        return baseEntityId;
    }

    public void setBaseEntityId(String baseEntityId) {
        this.baseEntityId = baseEntityId;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * WARNING: Overrides all existing addresses
     *
     * @param addresses
     * @return
     */
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address) {
        if (addresses == null) {
            addresses = new ArrayList<>();
        }
        addresses.add(address);
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    /**
     * WARNING: Overrides all existing attributes
     *
     * @param attributes
     * @return
     */
    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Object getAttribute(String name) {
        if (attributes == null) {
            return null;
        }
        for (String k : attributes.keySet()) {
            if (k.equalsIgnoreCase(name)) {
                return attributes.get(k);
            }
        }
        return null;
    }

    public void addAttribute(String name, Object value) {
        if (attributes == null) {
            attributes = new HashMap<>();
        }

        attributes.put(name, value);
    }

    public void removeAttribute(String name) {
        attributes.remove(name);
    }

    public Map<String, String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Map<String, String> identifiers) {
        this.identifiers = identifiers;
    }

    public String getIdentifier(String identifierType) {
        if (identifiers == null) {
            return null;
        }
        for (String k : identifiers.keySet()) {
            if (k.equalsIgnoreCase(identifierType)) {
                return identifiers.get(k);
            }
        }
        return null;
    }

    /**
     * Returns field matching the regex. Note that incase of multiple fields matching criteria
     * function would return first match. The must be well formed to find out a single value
     *
     * @param regex
     * @return
     */
    public String getIdentifierMatchingRegex(String regex) {
        for (Entry<String, String> a : getIdentifiers().entrySet()) {
            if (a.getKey().matches(regex)) {
                return a.getValue();
            }
        }
        return null;
    }

    public void addIdentifier(String identifierType, String identifier) {
        if (identifiers == null) {
            identifiers = new HashMap<>();
        }

        identifiers.put(identifierType, identifier);
    }

    public void removeIdentifier(String identifierType) {
        identifiers.remove(identifierType);
    }

    public BaseEntity withBaseEntityId(String baseEntityId) {
        this.baseEntityId = baseEntityId;
        return this;
    }

    /**
     * WARNING: Overrides all existing identifiers
     *
     * @param identifiers
     * @return
     */
    public BaseEntity withIdentifiers(Map<String, String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public BaseEntity withIdentifier(String identifierType, String identifier) {
        if (identifiers == null) {
            identifiers = new HashMap<>();
        }
        identifiers.put(identifierType, identifier);
        return this;
    }

    /**
     * WARNING: Overrides all existing addresses
     *
     * @param addresses
     * @return
     */
    public BaseEntity withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    public BaseEntity withAddress(Address address) {
        if (addresses == null) {
            addresses = new ArrayList<>();
        }
        addresses.add(address);
        return this;
    }

    /**
     * WARNING: Overrides all existing attributes
     *
     * @param attributes
     * @return
     */
    public BaseEntity withAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    public BaseEntity withAttribute(String name, Object value) {
        if (attributes == null) {
            attributes = new HashMap<>();
        }
        attributes.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
