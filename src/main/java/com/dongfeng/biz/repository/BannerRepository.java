package com.dongfeng.biz.repository;

import com.dongfeng.biz.data.BannerDO;
import com.sun.tools.javac.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
public interface BannerRepository extends JpaRepository<BannerDO, Long> {

    List<BannerDO> findByTabIdentity(String tabIdentity);
}
