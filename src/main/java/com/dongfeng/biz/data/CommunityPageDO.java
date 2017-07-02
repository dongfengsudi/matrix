package com.dongfeng.biz.data;

import lombok.Data;

import java.util.List;

/**
 * @author muying.xx
 * @date 2017-07-02
 */
@Data
public class CommunityPageDO {
    private List<List<CommunityCellDO>> lineList;

}
