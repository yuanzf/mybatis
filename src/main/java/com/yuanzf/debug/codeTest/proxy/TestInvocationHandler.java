package com.yuanzf.debug.codeTest.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: yzf
 * @Date: 2019-01-18 10:59
 * @Desoription:
 */
public class TestInvocationHandler implements InvocationHandler {

    private Marketting marketting;

    public TestInvocationHandler(Marketting marketting) {
        this.marketting = marketting;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            return method.invoke(this,args);
    }
}
