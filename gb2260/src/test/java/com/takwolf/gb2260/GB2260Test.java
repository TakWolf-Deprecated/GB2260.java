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

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCodePrefix() {
        gb2260.findDivisions("ab");
    }

    @Test
    public void test0() {
        List<Province> provinceList = gb2260.getProvinces();
        Assert.assertEquals(provinceList.size(), 34);
    }

    @Test
    public void test1() {
        Division division = gb2260.getDivision("110000");
        Assert.assertTrue(division instanceof Province);
        Assert.assertEquals(division.getCode(), "110000");
        Assert.assertEquals(division.getName(), "北京市");
    }
    
}
