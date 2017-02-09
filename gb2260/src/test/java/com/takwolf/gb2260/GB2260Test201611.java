package com.takwolf.gb2260;

import org.junit.Assert;
import org.junit.Test;

public class GB2260Test201611 {

    private static final GB2260 gb2260 = new GB2260();

    @Test
    public void test110000() {
        Division division = gb2260.getDivision("110000");
        Assert.assertEquals(division.getCode(), "110000");
        Assert.assertEquals(division.getName(), "北京市");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCode() {
        gb2260.getDivision("000000");
    }

}
