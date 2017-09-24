package com.dongfeng.biz.dao;

import com.dongfeng.biz.data.CellDO;
import com.dongfeng.biz.repository.CellRepository;
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
public class CellDAO {

    @Resource
    private CellRepository cellRepository;

    public List<CellDO> findByTabIdentity(String tabIdentity) {
        Try<List<CellDO>> tryResult = Try.of(() -> cellRepository.findByTabIdentity(tabIdentity));
        return tryResult.onFailure(e -> e.printStackTrace()).getOrElse(Lists.newArrayList());
    }

    public boolean addCell(CellDO cellDO) {
        return Try.of(() -> cellRepository.save(cellDO)).isSuccess();
    }

    public CellDO findOne(long id) {
        return Try.of(()-> cellRepository.findOne(id)).getOrElse((CellDO) null);
    }




}
