package com.takwolf.gb2260;

import java.util.regex.Pattern;

/**
 * 五级划分对应的英文分别为：
 * 省 Province，市 Prefecture，县 County，乡 Township，村 Village
 */
public final class Division {

    public enum Level {
        PROVINCE, PREFECTURE, COUNTY
    }

    private final GB2260 gb2260;
    private final String code;
    private final String name;
    private final Level level;

    protected Division(GB2260 gb2260, String code, String name) {
        this.gb2260 = gb2260;
        this.code = code;
        this.name = name;
        if (Pattern.matches("^\\d{2}0{4}$", code)) {
            level = Level.PROVINCE;
        } else if (Pattern.matches("^\\d{4}0{2}$", code)) {
            level = Level.PREFECTURE;
        } else {
            level = Level.COUNTY;
        }
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Revision getRevision() {
        return gb2260.getRevision();
    }

    public Level getLevel() {
        return level;
    }

    public boolean isProvince() {
        return level == Level.PROVINCE;
    }

    public boolean isPrefecture() {
        return level == Level.PREFECTURE;
    }

    public boolean isCounty() {
        return level == Level.COUNTY;
    }

}
