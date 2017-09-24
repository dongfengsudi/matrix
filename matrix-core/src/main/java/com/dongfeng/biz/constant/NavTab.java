package com.dongfeng.biz.constant;

import lombok.Getter;
import lombok.Setter;

/**
 * 用来表明页面分类的 枚举
 * @author muying.xx
 * @date 2017-09-16
 */

public enum NavTab {
    CITY(1, "市区信息","city"),
    TOWN(2,"镇级条线","town"),
    COMMUNITY(3,"基层社区","community"),

    ;
    NavTab(int position, String name, String identity) {
        this.position = position;
        this.name = name;
        this.identity = identity;
    }

    @Setter @Getter
    private int position; // 表明具体位置
    @Setter @Getter
    private String name;  // 显示内容
    @Setter @Getter
    private String identity;  // 标识

}

