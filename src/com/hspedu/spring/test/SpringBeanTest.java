package com.hspedu.spring.test;

import com.hspedu.spring.bean.Monster;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:Black Sunshine
 * Date:2024/12/23 13:00
 */
public class SpringBeanTest {
    @Test
    public void m1(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Monster monster01 = (Monster)ioc.getBean("my_monster");
        System.out.println(monster01);
    }
}
