package kewai.lianxi.java;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("输入数据");
        String s=scanner.next();
        System.out.println("输入的数据为："+s);
    }
}
