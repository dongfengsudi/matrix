package com.dongfeng.biz.dao;

import com.dongfeng.biz.data.BannerDO;
import com.dongfeng.biz.repository.BannerRepository;
import com.google.common.collect.Lists;
import io.vavr.control.Try;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 对repository层的包装, 增加了 try的逻辑
 * @author muying.xx
 * @date 2017-09-16
 */
@Component
public class BannerDAO {

    @Resource
    private BannerRepository bannerRepository;

    public List<BannerDO> findByTabIdentity(String tabIdentity) {
        Try<List<BannerDO>> tryResult = Try.of(() -> bannerRepository.findByTabIdentity(tabIdentity));
        return tryResult.onFailure(e -> e.printStackTrace()).getOrElse(Lists.newArrayList());
    }



}
