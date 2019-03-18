package com.yuanzf.debug.codeTest.mutilThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yzf
 * @Date: 2019-02-25 18:42
 * @Desoription:
 */
public class Abc1 {
    private static volatile int state = 0;

    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                while (state < 30) {
                    lock.lock();
                    if (state % 3 == 0) {
                        System.out.println("A"+state);
                        state++;
                    }
                    lock.unlock();
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (state < 30) {
                    lock.lock();
                    if (state % 3 == 1) {
                        System.out.println("B"+state);
                        state++;
                    }
                    lock.unlock();
                }
            }
        });

        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                while (state < 30) {
                    lock.lock();
                    if (state % 3 == 2) {
                        System.out.println("C"+state);
                        state++;
                    }
                    lock.unlock();
                }
            }
        });
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
