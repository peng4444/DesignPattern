package cn.pbj.behavior.strategy;

/**
 * 负责和具体的策略进行交互
 * 具体选用哪个报价策略，这需要根据实际情况来确定。这时候，我们采用策略模式即可。
 * 具体算法和客户端进行分离，使得算法可以独立于客户端的变化
 */
public class Context {
    public Strategy strategy;//当前采用的算法对象

    //通过构造器注入
    public Context (Strategy strategy){
        super();
        this.strategy = strategy;
    }

    //通过set方法注入

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s){

        System.out.println("打印报价："+strategy.getPrice(s));
    }
}
