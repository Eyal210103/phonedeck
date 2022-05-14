package com.eyal_darmon.phonedeck.utils;

import com.google.gson.JsonObject;

import java.util.Arrays;

public class JsonBuilder {
    public final JsonObject mJson;

    public JsonBuilder() {
        mJson = new JsonObject();
    }

    public String toJson() {
        return mJson.toString();
    }

    public JsonBuilder add(String key, String value) {
        mJson.addProperty(key, value);
        return this;
    }

    public JsonBuilder add(String key, Object[] args) {
        mJson.addProperty(key, Arrays.toString(args));
        return this;
    }

    public JsonBuilder add(String key, JsonBuilder value) {
        mJson.add(key, value.mJson);
        return this;
    }
}