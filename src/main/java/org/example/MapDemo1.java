package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    /*
    map的常用api
    1.添加元素
    put(K key,V value):V

    2.删除元素
    remove(K key):V
    删除指定key的key-value对，返回被删除的value值
    若key不存在，则返回null

    3.移除所有元素
    clear():void

    4.判断是否包含指定key
    containsKey(K key):boolean

    5.判断是否包含指定value
    containsValue(V value):boolean

    6.判断map是否为空
    isEmpty():boolean

    7.集合的长度
    size():int
     */

    public static void main(String[] args) {
        Map<String,String > map = new HashMap<>();
        map.put("张三","北京");
        map.put("李四","上海");
        map.put("王五","广州");
        System.out.println(map);
        System.out.println(map.containsKey("李四"));
        System.out.println(map.containsValue("上海"));
        System.out.println(map.size());
        System.out.println("---------------------------------------");

        map.remove("李四");
        System.out.println(map);
        System.out.println(map.containsKey("李四"));
        System.out.println(map.containsValue("上海"));
        System.out.println(map.size());
        System.out.println("---------------------------------------");


        System.out.println(map.isEmpty());
        System.out.println("---------------------------------------");

        map.clear();
        System.out.println(map.isEmpty());




    }

}
