package com.takwolf.gb2260;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GB2260Test {

    private static final GB2260 gb2260 = new GB2260();

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCode() {
        gb2260.getDivision("abcdef");
    }

    @Test
    public void test1() {
        Division beijing = gb2260.getDivision("110000");
        Assert.assertEquals(beijing.getCode(), "110000");
        Assert.assertEquals(beijing.getName(), "北京市");
    }

    @Test
    public void test2() {
        List<Province> provinceList = gb2260.getProvinces();
        Assert.assertEquals(provinceList.size(), 34);
    }

    @Test
    public void test3() {
        List<Province> provinceList = gb2260.findProvinces("1");
        Assert.assertEquals(provinceList.size(), 5);
    }

}
