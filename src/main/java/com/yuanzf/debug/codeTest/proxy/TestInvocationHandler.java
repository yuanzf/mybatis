package com.yuanzf.debug.codeTest.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yzf
 * @Date: 2019-01-18 10:59
 * @Desoription:
 */
public class TestInvocationHandler implements InvocationHandler {

    private Map<String, Marketting> allShop = new HashMap<>();
    private Marketting object;

    public TestInvocationHandler() {
        allShop.put("shopA", new ShopA());
        allShop.put("shopB", new ShopB());
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (args[0].equals("shopA")) {
            this.object = allShop.get("shopA");
        }
        if (args[0].equals("shopB")) {
            this.object = allShop.get("shopB");
        }
        return method.invoke(object, args);
    }
}
