package com.yuanzf.debug.codeTest;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: yzf
 * @Date: 2019-02-20 14:16
 * @Desoription:
 */
public class CountDownLatchTest {
    static CountDownLatch countDownLatch = new CountDownLatch(2);
    public static void main(String[] args) throws InterruptedException {
         new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 start");
                try {
                    Thread.currentThread().sleep(2000);
                    System.out.println(Thread.currentThread().getName());
                    countDownLatch.countDown();
                    System.out.println("thread1 end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2 start");
                try {
                    Thread.currentThread().sleep(2000);
                    System.out.println(Thread.currentThread().getName());
                    countDownLatch.countDown();
                    System.out.println("thread2 end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        System.out.println("main cell countDownLatch.await");
        countDownLatch.await();
        System.out.println("main end");
    }
}
