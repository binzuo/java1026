package kewai.lianxi.java;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public interface CollectionTest {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add("南无地藏菩萨摩诃萨");
        collection.add("南无阿弥陀佛");
        collection.remove("南无地藏菩萨摩诃萨");
        collection.add("南无本师释迦牟尼佛");
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        System.out.println(collection.contains("南无地藏菩萨摩诃萨"));
        System.out.println(collection.toArray());
    }
}
