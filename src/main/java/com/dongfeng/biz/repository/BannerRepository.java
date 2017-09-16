package com.dongfeng.biz.repository;

import com.dongfeng.biz.data.BannerDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
public interface BannerRepository extends JpaRepository<BannerDO, Long> {

    List<BannerDO> findByTabIdentity(String tabIdentity);
}
