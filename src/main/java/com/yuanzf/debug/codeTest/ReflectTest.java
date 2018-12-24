package com.yuanzf.debug.codeTest;

import com.yuanzf.debug.cache.TestCache;

import java.lang.reflect.Method;

/**
 * @Author: yzf
 * @Date: 2018-12-24 17:38
 * @Desoription:
 */
public class ReflectTest {
    public static void main(String[] args) {
        TestCache testCache = new TestCache();
        Class<? extends TestCache> aClass = testCache.getClass();

        Method[] methods = aClass.getMethods();
        for (Method method : methods){
            Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.println("=======method=======");
            System.out.println(method.getName());
            System.out.println("=======parameterTypes=======");
            for (Class cla: parameterTypes) {
                System.out.println(cla.getName());
            }
        }
    }
}
