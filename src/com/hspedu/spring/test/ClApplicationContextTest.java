package com.hspedu.spring.test;

import com.hspedu.spring.bean.Monster;
import com.hspedu.spring.clapplicationcontext.ClApplicationContext;
import org.dom4j.DocumentException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:Black Sunshine
 * Date:2024/12/23 15:43
 */
public class ClApplicationContextTest {
    public static void main(String[] args) throws DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ClApplicationContext clApplicationContext = new ClApplicationContext("beans.xml");
        Monster monster01 =(Monster)clApplicationContext.getBean("monster01");
        System.out.println(monster01);
    }
}
