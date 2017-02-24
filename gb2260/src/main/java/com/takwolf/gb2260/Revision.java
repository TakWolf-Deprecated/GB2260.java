package com.takwolf.gb2260;

public enum Revision {

    V201611("201611");

    public static final Revision LATEST = V201611;

    private final String code;

    Revision(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    protected String getDbPath() {
        return "/gb2260/" + code + ".txt";
    }

}
