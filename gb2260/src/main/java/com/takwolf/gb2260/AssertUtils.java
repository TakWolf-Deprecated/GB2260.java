package com.takwolf.gb2260;

import org.apache.commons.lang3.StringUtils;

class AssertUtils {

    public static void checkDivisionCode(String divisionCode) {
        if (!StringUtils.isNumeric(divisionCode) || StringUtils.length(divisionCode) != 6) {
            throw new IllegalArgumentException("Invalid division code format.");
        }
    }

    public static void checkDivisionCodePrefix(String divisionCodePrefix) {
        if (!StringUtils.equals(divisionCodePrefix, "")) {
            if (!StringUtils.isNumeric(divisionCodePrefix) || StringUtils.length(divisionCodePrefix) > 6) {
                throw new IllegalArgumentException("Invalid division code prefix format.");
            }
        }
    }

}
