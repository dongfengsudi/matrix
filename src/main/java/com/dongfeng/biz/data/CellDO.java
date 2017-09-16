package com.dongfeng.biz.data;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
@Entity
@Table(name = "cell")
@Data
public class CellDO {

    @Id
    @GeneratedValue
    private long id;

    private Date gmtCreate;
    private Date gmtModified;
    private byte deleted;

    private String title;
    private String backgroundImg;
    private String link;
    private String description;
    private String tabIdentity;


}
