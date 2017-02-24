package com.takwolf.gb2260;

/**
 * 省级行政区划单位，包括：省、自治区、直辖市、特别行政区
 */
public final class Province extends Division {

    protected Province(GB2260 gb2260, String code, String name) {
        super(gb2260, code, name);
    }

}
