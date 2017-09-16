package com.dongfeng.biz.data;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zihan on 2017/9/16.
 */

 @Entity
 @Table(name = "t1")
 @Data
public class T1 {
    @Id
    @GeneratedValue
    private int id;
    private String name;


}
