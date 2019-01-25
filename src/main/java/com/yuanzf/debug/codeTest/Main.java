package com.yuanzf.debug.codeTest;

/**
 * @Author: yzf
 * @Date: 2019-01-23 11:39
 * @Desoription:
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder append = new StringBuilder("计").append("软");
        String str1 = append.toString();
        StringBuilder append1 = new StringBuilder("jaq").append("va");
        String str2 = append1.toString();
        System.out.println(str1.intern() == str1);
        System.out.println(str2.intern() == str2);
    }
}

