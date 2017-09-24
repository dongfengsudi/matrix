package com.dongfeng.biz.repository;

import com.dongfeng.biz.data.T1;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
public interface T1Repository extends JpaRepository<T1, Integer> {
    T1 findById(int id);
}
