package com.takwolf.gb2260;

/**
 * 行政区划
 */
public abstract class Division implements Comparable<Division> {

    private final GB2260 gb2260;
    private final String code;
    private final String name;

    protected Division(GB2260 gb2260, String code, String name) {
        this.gb2260 = gb2260;
        this.code = code;
        this.name = name;
    }

    protected GB2260 getGB2260() {
        return gb2260;
    }

    public String getCode() {
        return code;
    }

    public String getProvinceCodePrefix() {
        return code.substring(0, 2);
    }

    public String getPrefectureCodePrefix() {
        return code.substring(0, 4);
    }

    public String getName() {
        return name;
    }

    public Revision getRevision() {
        return gb2260.getRevision();
    }

    @Override
    public final int compareTo(Division o) {
        return getCode().compareTo(o.getCode());
    }

}
