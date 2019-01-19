package com.yuanzf.debug.codeTest.proxy;


import javassist.util.proxy.ProxyFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * @Author: yzf
 * @Date: 2019-01-17 16:35
 * @Desoription:
 */
public class ProxyMain {
    public static void main(String[] args) {
        Class shopAClass = ShopA.class;
        ShopA shopA1 = new ShopA();
        shopA1.buy("test");
        TestInvocationHandler testInvocationHandler = new TestInvocationHandler(shopA1);
        Marketting shopA =(Marketting) Proxy.newProxyInstance(Marketting.class.getClassLoader(), new Class[]{Marketting.class}, testInvocationHandler);
        System.out.println("before");
        shopA.sell();
        System.out.println("after");
    }
}
