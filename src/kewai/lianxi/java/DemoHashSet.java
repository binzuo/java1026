package kewai.lianxi.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class DemoHashSet {
    public static void main(String[] args) {


        HashSet hashSet = new HashSet();
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("请依次输入学生姓名，空行表示结束");
        while (true){
            name=scanner.nextLine();//扫描下一行的名字。
            if (name.length()>0){//若读了空行，则name的长度为0。
                hashSet.add(name);
            }else {
                break;
            }
        }
        System.out.println(hashSet);
        System.out.println("请输入要删除的学生姓名，空行表示结束");
        while (true){
            name=scanner.nextLine();
            if (name.length()>0){
                if (hashSet.remove(name)){
                    System.out.println("删除成功"+name);
                }else {
                    System.out.println("没找到此人"+name);
                }
            }else {
                break;
            }
        }
        System.out.println("还剩下的学生有：");
        Iterator iterator=hashSet.iterator();
        while (true){
            if (iterator.hasNext()){
                System.out.println(iterator.next().toString());
            }else {
                break;
            }
        }
        scanner.close();

    }

}
