package com.guoyun.string;

import java.util.Scanner;

/**
 * 完成字符串的反转
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建输入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //调用方法，用一个变量接收结果
        String reverseString  = reverse(line);

        System.out.println("s:" + reverseString);

    }

    /**
     * @param s 接受的字符串
     * @return 返回一个反转的字符串
     */
    public static String reverse(String s) {
        //初始化
        String ss = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }
}
