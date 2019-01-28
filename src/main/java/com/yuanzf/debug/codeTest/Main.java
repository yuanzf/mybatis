package com.yuanzf.debug.codeTest;

import com.yuanzf.debug.codeTest.proxy.ShopA;

/**
 * @Author: yzf
 * @Date: 2019-01-23 11:39
 * @Desoription:
 */
public class Main {
    public static void main(String[] args) {
        Class<?>[] interfaces = GetInterfaceTest.class.getInterfaces();
        System.out.println(interfaces);
    }
}

