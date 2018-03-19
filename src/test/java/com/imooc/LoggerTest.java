package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/19
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void fun1() {
        String name = "Lucy";

        log.debug("debug...");
        log.info("info....name={}",name);
        log.warn("warn...");
        log.error("error");
    }
}
