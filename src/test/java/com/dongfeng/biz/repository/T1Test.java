package com.dongfeng.biz.repository;

import com.dongfeng.MatrixApplicationTests;
import com.dongfeng.biz.data.T1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 *
 * todo  这个有问题, 等等在处理
 * @author muying.xx
 * @date 2017-09-16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(MatrixApplicationTests.class)
public class T1Test {

    @Resource
    private T1Repository t1Repository;

    @Test
    public void test() {
        T1 t1 = t1Repository.findById(1);
        System.out.println(t1.getName());
    }


}
