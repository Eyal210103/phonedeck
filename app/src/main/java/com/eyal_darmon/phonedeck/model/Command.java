package com.eyal_darmon.phonedeck.model;

import com.eyal_darmon.phonedeck.utils.JsonBuilder;

public class Command {
    private final CommandType mCommandType;
    private final Object[] mArgs;

    public Command(CommandType commandType, Object[] args) {
        mCommandType = commandType;
        mArgs = args;
    }

    public String getJson() {
        return new JsonBuilder()
                .add("type", mCommandType.mName)
                .add("args", mArgs)
                .toJson();
    }

    public enum CommandType {
        // like server consts
        SHELL("SHELL"),
        PUT_FILE("PUT_FILE"),
        LAUNCH_APPLICATION("LAUNCH_APPLICATION");

        private final String mName;

        CommandType(String name) {
            mName = name;
        }
    }
}
