package com.takwolf.gb2260;

public enum Revision {

    V201609("201609"),

    V201610("201610"),

    V201611("201611");

    public static final Revision LATEST = V201611;

    private final String code;

    Revision(String code) {
        this.code = code;
    }

    protected String getDbPath() {
        return "/gb2260/" + code + ".txt";
    }

}
