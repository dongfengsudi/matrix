package com.dongfeng.controller.test;

import com.dongfeng.biz.data.T1;
import com.dongfeng.biz.repository.T1Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author muying.xx
 * @date 2017-09-16
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private T1Repository t1Repository;

    @RequestMapping("/t1.htm")
    public String testT1(@RequestParam(value="id") int id) {
        T1 t1 = t1Repository.findById(id);
        if (t1 != null) {
            return t1.getName();
        } else {
            return "find nothing";
        }
    }


}
