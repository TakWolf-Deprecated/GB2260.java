package com.takwolf.gb2260;

import java.util.List;

/**
 * 省级行政区划单位，包括：省、自治区、直辖市、特别行政区
 */
public final class Province extends Division {

    protected Province(GB2260 gb2260, String code, String name) {
        super(gb2260, code, name);
    }

    public List<Prefecture> getPrefectures() {
        return getGB2260().findPrefectures(getProvinceCodePrefix());
    }

    public List<County> getCounties() {
        return getGB2260().findCounties(getProvinceCodePrefix());
    }

}
