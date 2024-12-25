package com.hspedu.spring.factory;

import com.hspedu.spring.bean.Monster;

import java.util.HashMap;

/**
 * Author:Black Sunshine
 * Date:2024/12/23 22:04
 */
public class MyStaticFactory {
    private static HashMap<String,Monster> hashMap;
    static {
        hashMap=new HashMap();
        hashMap.put("my_monster01",new Monster("牛魔","芭蕉扇",100));
        hashMap.put("my_monster02",new Monster("狐狸精","魅惑",100));

    }
    public static Monster getBean(String key){
        return  hashMap.get(key);
    }
}
