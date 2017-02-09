package com.takwolf.gb2260;

public final class Division {

    private final String code;
    private final String name;

    protected Division(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
