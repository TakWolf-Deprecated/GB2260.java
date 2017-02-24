package com.takwolf.gb2260;

/**
 * 市级行政区划单位，包括：地级市、地区、自治州、盟
 */
public final class Prefecture extends Division {

    protected Prefecture(GB2260 gb2260, String code, String name) {
        super(gb2260, code, name);
    }

}
