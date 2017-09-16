package com.dongfeng.biz.vo;

import com.dongfeng.biz.data.CommunityCellDO;
import lombok.Data;

import java.util.List;

/**
 * @author muying.xx
 * @date 2017-07-02
 */
@Data
public class CommunityPageVO {
    private List<List<CommunityCellDO>> lineList;

}
