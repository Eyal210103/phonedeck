package com.eyal_darmon.phonedeck.model;

import com.eyal_darmon.phonedeck.utils.JsonBuilder;

public class RetrieverRequest {
    private final RetrieverType mRetrieverType;

    public RetrieverRequest(RetrieverType retrieverType) {
        mRetrieverType = retrieverType;
    }

    public String getJson() {
        return new JsonBuilder()
                .add("type", mRetrieverType.mName)
                .toJson();
    }

    public enum RetrieverType {
        // like server consts
        GET_SOFTWARE_LIST("GET_INSTALLED_SOFTWARE");

        private final String mName;

        RetrieverType(String name) {
            mName = name;
        }
    }
}
