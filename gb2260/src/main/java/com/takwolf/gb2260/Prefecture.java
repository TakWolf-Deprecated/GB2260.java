package com.takwolf.gb2260;

import java.util.List;

/**
 * 市级行政区划单位，包括：地级市、地区、自治州、盟
 */
public final class Prefecture extends Division {

    protected Prefecture(GB2260 gb2260, String code, String name) {
        super(gb2260, code, name);
    }

    public Province getProvince() {
        return (Province) getGB2260().getDivision(getProvinceCodePrefix());
    }

    public List<County> getCounties() {
        return getGB2260().findCounties(getPrefectureCodePrefix());
    }

}
