package org.opensrp.api.util;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class EntityUtils {

    public static <T> T fromJson(String json, Class<T> clazz) {
        return new Gson().fromJson(json, clazz);
    }

    public static <T> T fromJson(InputStream json, Class<T> clazz) {
        return new Gson().fromJson(new InputStreamReader(json), clazz);
    }

    public static <T> T fromJson(Reader json, Class<T> clazz) {
        return new Gson().fromJson(json, clazz);
    }
}
