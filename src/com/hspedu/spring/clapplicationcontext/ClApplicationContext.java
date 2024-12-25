package com.hspedu.spring.clapplicationcontext;

import com.hspedu.spring.bean.Monster;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author:Black Sunshine
 * Date:2024/12/23 15:43
 */
public class ClApplicationContext {
    private ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap<>();

    public ClApplicationContext(String FileName) throws DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //获取类加载路径
        String path = this.getClass().getResource("/").getPath();
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(new File(path+FileName));
        Element rootElement = read.getRootElement();
        Element bean =(Element) rootElement.elements("bean").get(0);
        String Monsterid = bean.attributeValue("id");
        String ClassFullName = bean.attributeValue("class");
        List<Element> property = bean.elements("property");
        Integer monsterid = Integer.parseInt(property.get(0).attributeValue("value"));
        String name = property.get(1).attributeValue("value");
        String skill = property.get(2).attributeValue("value");


        Class<?> aClass = Class.forName(ClassFullName);
        Monster o = (Monster)aClass.newInstance();
        o.setName(name);
        o.setMonsterID(monsterid);
        o.setSkill(skill);
        concurrentHashMap.put(Monsterid,o);
    }
    public Object getBean(String ID){
        return concurrentHashMap.get(ID);
    }
}
