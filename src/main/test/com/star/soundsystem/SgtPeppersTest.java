package com.star.soundsystem;

import com.star.config.CDPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by hp on 2017/1/13.
 */
//使用该注解以便在测试开始的时候自动创建Spring的应用上下文
@RunWith(SpringJUnit4ClassRunner.class)
//该注解会告诉Spring应用上下文需要在CDPlayerConfig中加载配置
@ContextConfiguration(classes = CDPlayerConfig.class)
public class SgtPeppersTest {
    //该注解可以实现自动装配
    @Autowired
    private CompackDisc cd;

    @Test
    public void play() throws Exception {
        assertNotNull(cd);
        //调用接口的play方法，实际上调用的是Spring自动配置好的SgtPeppers的play方法
        cd.play();
    }

}