package cn.pbj.behavior.observer;


/**
 * 观察者模式主要用于1：N的通知。当一个对象(目标对象Subject或Objservable)的状态变化时，
 * 他需要及时告知一系列对象(观察者对象,Observer)，令他们做出响应
 * JAVASE提供了java.util.Observable和java.util.Observer来实现观察者模式
 * 开发中常见的场景：
 * 聊天室程序的，服务器转发给所有客户端
 * 网络游戏(多人联机对战)场景中，服务器将客户端的状态进行分发
 * 邮件订阅
 * Servlet中，监听器的实现
 * Android中，广播机制
 * JDK的AWT中事件处理模型,基于观察者模式的委派事件模型(Delegation  Event  Model)
 * 事件源----------------目标对象
 * 事件监听器------------观察者
 * 京东商城中，群发某商品打折信息
 */
public class TestDemo {
    public static void main(String[] args) {

        //目标对象
        ConcreteSubject concreteSubject = new ConcreteSubject();

        //创建多个观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //将这三个观察者添加到subject对象的观察者队伍中
        concreteSubject.registerObserver(obs1);
        concreteSubject.registerObserver(obs2);
        concreteSubject.registerObserver(obs3);

        //改变subject的状态
        concreteSubject.setState(3000);
        System.out.println("**************");
        //看看观察者的状态是不是也变化了
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        //改变subject的状态
        concreteSubject.setState(30);
        System.out.println("**************");
        //看看观察者的状态是不是也变化了
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
