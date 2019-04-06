package cn.pbj.others.future;

import java.util.concurrent.*;

/**
 * future设计模式
 * https://www.cnblogs.com/wang-meng/p/10149068.html
 * 一种非常经典的设计模式，这种设计模式主要就利用空间换时间得到概念，也就是说异步执行（需要开启一个新的线程）。
 * 在互联网高并发的应用服务中，我们随处可见这种理念和代码，主要就是使用了这种模式。
 * Future模式非常适合在处理耗时很长的业务逻辑时进行使用，可以有效的减小系统的响应时间，提高系统的吞吐量。
 */
public class UseFuture implements Callable<String> {

    private String param;

    public UseFuture(String param) {
        this.param = param;
    }

    @Override
    public String call() throws Exception {
        //模拟执行业务逻辑的耗时
        TimeUnit.SECONDS.sleep(3);
        String result = this.param + " 处理完成！";
        return result;
    }

    public static void main(String[] args) throws Exception{
        String queryStr = "query1";
        String queryStr2 = "query2";
        FutureTask<String> future1 = new FutureTask<String>(new UseFuture(queryStr));
        FutureTask<String> future2 = new FutureTask<String>(new UseFuture(queryStr2));

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(future1);//异步操作
        executorService.submit(future2);//异步操作

        System.out.println("执行中...");

        TimeUnit.SECONDS.sleep(2);//处理其他相关的任务。
        String result1 = future1.get();
        String result2 = future2.get();

        System.out.println("数据处理完成。。" + result1);
        System.out.println("数据处理完成。。" + result2);
    }
}
