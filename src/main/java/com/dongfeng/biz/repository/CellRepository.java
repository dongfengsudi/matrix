package com.dongfeng.biz.repository;

import com.dongfeng.biz.data.CellDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
public interface CellRepository  extends JpaRepository<CellDO, Long> {
    // List<CellDO> findByTabIdentity(String tabIdentity);
}
