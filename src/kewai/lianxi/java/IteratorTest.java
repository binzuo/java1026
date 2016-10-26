package kewai.lianxi.java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("南无地藏菩萨摩诃萨");
        collection.add("南无阿弥陀佛");
        collection.add("南无本师释迦牟尼佛");
        Iterator iterator=collection.iterator();//获取collections集合对应的迭代器。
        while (iterator.hasNext()){
            String collections=(String)iterator.next();
            System.out.println(collections);//南无地藏菩萨摩诃萨
                                           //南无阿弥陀佛
                                           //南无本师释迦牟尼佛
            if (collections.equals("南无阿弥陀佛")){
                iterator.remove();
            }
            collections="测试字符串";//对collections变量赋值，不会改变集合元素本身.
        }
        System.out.println(collection);//[南无地藏菩萨摩诃萨，南无本师释迦牟尼佛]
    }

}
