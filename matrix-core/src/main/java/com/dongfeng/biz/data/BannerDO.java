package com.dongfeng.biz.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
@Entity
@Table(name = "banner")
@Data
public class BannerDO extends BaseDO {

    @Id
    @GeneratedValue
    private long id;

    private Date gmtCreate;
    private Date gmtModified;
    private byte deleted;

    private String picUrl;  // banner 图片链接
    private String link;    // banner 跳转链接
    private String tabIdentity; // 标识符

}
