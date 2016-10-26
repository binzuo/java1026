package kewai.lianxi.java;



import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
class K{
    int count;
    public K(int count){
        this.count=count;
    }
    public String toString(){
        return "K(count属性:"+count+")";
    }
    public boolean equals(Object obj){
        if (obj instanceof K){
            K k=(K)obj;
            if (k.count==this.count){
                return true;
            }
        }
        return false;
    }
    public int hashCode(){
        return this.count;
    }

}
public class DemoHashSet2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new K(1));
        hashSet.add(new K(5));
        hashSet.add(new K(-3));
        hashSet.add(new K(9));
        hashSet.add(new K(-2));
        hashSet.add(new K(0));
        hashSet.add(new K(4));
        System.out.println(hashSet);
// 输出：[K(count属性:0), K(count属性:1), K(count属性:-2), K(count属性:-3), K(count属性:4), K(count属性:5), K(count属性:9)]
        Iterator iterator=hashSet.iterator();
        K first=(K)iterator.next();
        first.count =-3;//改的是对象属性，并没有改对象。
        System.out.println(hashSet);
//输出：[K(count属性:-3), K(count属性:1), K(count属性:-2), K(count属性:-3), K(count属性:4), K(count属性:5), K(count属性:9)]
        hashSet.remove(new K(-3));
        System.out.println(hashSet);
//输出：[K(count属性:-3), K(count属性:1), K(count属性:-2), K(count属性:4), K(count属性:5), K(count属性:9)]
        System.out.println("hashSet中包含count值为-3的对象吗："+hashSet.contains(new K(-3)));//false
        System.out.println("hashSet中包含count值为1的对象吗："+hashSet.contains(new K(1)));//true
    }
}
