package com.a_linOnline.demo;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.catalina.core.ApplicationContext;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.assertj.ApplicationContextAssert;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

/**
 * SpringBoot单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器功能
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

//    记录器
//    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {

        //System.out.println(person);

        // 日志的级别：
        // 由低到高 trace<debug<info<warn<error>
        // 可以调整输出的日志级别
//        logger.trace("这是trace日志......");
//        logger.debug("这是trace日志......");
        // springboot默认输出的是info级别，可以在怕properties里面指定
//        logger.info("这是trace日志......");
//        logger.warn("这是trace日志......");
//        logger.error("这是error日志......");

    }
}
