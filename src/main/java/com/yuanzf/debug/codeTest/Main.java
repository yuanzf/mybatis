package com.yuanzf.debug.codeTest;

import com.yuanzf.debug.codeTest.proxy.ShopA;

/**
 * @Author: yzf
 * @Date: 2019-01-23 11:39
 * @Desoription:
 */
public class Main {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(1000);
        Integer integer1 = Integer.valueOf(1000);
        System.out.println(integer == integer1);
    }
}

