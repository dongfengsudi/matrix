package com.dongfeng.admin.biz.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zihan on 2017/9/16.
 */
@Entity
@Table(name = "user")
@Data
public class UserDO {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String password;

    public String getPassword(){
        return password;
    }
}
