package com.dongfeng.admin.biz.repository;

import com.dongfeng.admin.biz.data.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zihan on 2017/9/16.
 */
public interface UserRepository extends JpaRepository<UserDO, Long> {
    UserDO findByNameAndPassword(String name, String password);
}
