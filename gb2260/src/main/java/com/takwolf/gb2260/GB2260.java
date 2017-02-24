package com.takwolf.gb2260;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class GB2260 {

    private final Revision revision;
    private final Map<String, Division> divisionMap = new HashMap<>();

    public GB2260() {
        this(Revision.LATEST);
    }

    public GB2260(Revision revision) {
        this.revision = revision;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(GB2260.class.getResourceAsStream(revision.getDbPath()), StandardCharsets.UTF_8));
            String line;
            while ((line = reader.readLine()) != null) {
                // 忽略注释
                int annotationPosition = line.indexOf("#");
                if (annotationPosition != -1) {
                    line = line.substring(0, annotationPosition);
                }
                // 处理多余空格
                line = line.trim().replaceAll(" +", " ");
                // 按照两段解析
                if (StringUtils.isNotBlank(line)) {
                    String[] array = line.split(" ");
                    String code = array[0];
                    String name = array[1];
                    Division division;
                    if (Pattern.matches("^\\d{2}0{4}$", code)) {
                        division = new Province(this, code, name);
                    } else if (Pattern.matches("^\\d{4}0{2}$", code)) {
                        division = new Prefecture(this, code, name);
                    } else {
                        division = new County(this, code, name);
                    }
                    divisionMap.put(division.getCode(), division);
                }
            }
            reader.close();
        } catch (IOException e) {
            throw new AssertionError("GB2260 database for revision '" + revision.getCode() + "' init error.", e);
        }
    }

    public Revision getRevision() {
        return revision;
    }

    public Division getDivision(String code) {
        if (divisionMap.containsKey(code)) {
            return divisionMap.get(code);
        } else {
            throw new IllegalArgumentException("Invalid division code.");
        }
    }

}
