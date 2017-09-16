package com.dongfeng.biz.test;

import com.dongfeng.biz.utils.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
public class TestArraySplit {

    public static void main(String[] args) {
        List<String> tarArr = new ArrayList<String>();
        tarArr.add("a");
        tarArr.add("b");
        tarArr.add("c");
        tarArr.add("d");
        tarArr.add("e");
        tarArr.add("f");
        tarArr.add("g");
        tarArr.add("h");

        List<List<String>> result = ArrayUtils.createList(tarArr, 2);

        for(List<String> subArr:result) {
            for(String str:subArr) {
                System.out.println(str);
            }
            System.out.println();
        }

    }


}
