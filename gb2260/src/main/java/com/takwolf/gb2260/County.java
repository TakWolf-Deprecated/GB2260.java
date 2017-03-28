package com.takwolf.gb2260;

/**
 * 县级行政区划单位，包括：县、自治县、县级市、市辖区、旗、自治旗、林区、特区
 */
public final class County extends Division {

    protected County(GB2260 gb2260, String code, String name) {
        super(gb2260, code, name);
    }

    public Province getProvince() {
        return (Province) getGB2260().getDivision(getProvinceCodePrefix());
    }

    public Prefecture getPrefecture() {
        return (Prefecture) getGB2260().getDivision(getPrefectureCodePrefix());
    }

}
