package com.dongfeng.biz.data;

import lombok.Data;

import java.util.Date;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
@Data
public class BaseDO {
    private long id;
    private Date gmtCreate;
    private Date gmtModified;
    private byte deleted;

}
