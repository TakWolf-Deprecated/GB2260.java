# GB2260.java #

[![Build Status](https://travis-ci.org/TakWolf/GB2260.java.svg?branch=master)](https://travis-ci.org/TakWolf/GB2260.java)
[![Bintray](https://img.shields.io/bintray/v/takwolf/maven/GB2260.java.svg)](https://bintray.com/takwolf/maven/GB2260.java/_latestVersion)
[![License](https://img.shields.io/github/license/TakWolf/GB2260.java.svg)](https://opensource.org/licenses/MIT)

**Warning: this library breaks every five minutes for the moment.**

The Java implementation for looking up Chinese administrative divisions.

**注意：当前仍然是一个开发版本，以至于 API 可能会有破坏性的变动。**

中华人民共和国行政区划代码（GB/T 2260），数据库Java版实现。支持省市县三级。

该项目是对项目 [https://github.com/cn/GB2260.java](https://github.com/cn/GB2260.java) 的重新实现。

其他语言实现，请参考：[https://github.com/cn/GB2260](https://github.com/cn/GB2260)

## 数据来源 ##

[中华人民共和国民政部 > 中华人民共和国行政区划代码](http://www.mca.gov.cn/article/sj/tjbz/a/)

[中华人民共和国国家统计局 > 行政区划代码](http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/)

## 英文命名参考 ##

[中国各级行政区划的英文表达](http://www.24en.com/column/Khubilai/2010-08-31/119131.html)

## Usage ##

### Gradle ###

``` gradle
dependencies {
    compile 'com.takwolf:gb2260:0.0.2'
}

repositories {
    jcenter()
}
```

### Java ###

``` java
GB2260 gb2260 = new GB2260(); // 建议静态单例模式

Division beijing = gb2260.getDivision("110000");
System.out.println(beijing.getName()); // 北京市

Division hepingqu = gb2260.getDivision("210102"); // 和平区
Division shenyang = hepingqu.getPrefecture(); // 沈阳市
Division liaoning = hepingqu.getProvince(); // 辽宁省
```

## Author ##

TakWolf

[takwolf@foxmail.com](mailto:takwolf@foxmail.com)

[http://takwolf.com](http://takwolf.com)

## License ##

```
MIT License

Copyright (c) 2017 TakWolf

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
