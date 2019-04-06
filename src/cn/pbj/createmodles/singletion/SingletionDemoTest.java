package cn.pbj.createmodles.singletion;

import java.util.concurrent.CountDownLatch;

public class SingletionDemoTest {
    public static void main(String args[]) throws InterruptedException {

        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for (int i = 0;i<threadNum;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                       // Object o1 = SingletonDemo1.getInstance();//78
                       //  Object o2 = SingletonDemo2.getInstance();//95
                        // Object o3 = SingletonDemo3.getInstance();  //60
                        // Object o4 = SingletonDemo4.getInstance();  //73
                         Object o5 = SingletonDemo5.INSTANCE;   //39

                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
