package cn.pbj.behavior.state;

/**
 * 核心：
 * 用于解决系统中复杂对象的状态转换以及不同状态下行为的封装问题
 * 结构：
 * Context环境类
 * 环境类中维护一个State对象，他是定义了当前的状态。
 * State抽象状态类
 * ConcreteState具体状态类
 * 每一个类封装了一个状态对应的行为
 * 开发中常见的场景：
 * 银行系统中账号状态的管理
 * OA系统中公文状态的管理
 * 酒店系统中，房间状态的管理
 * 线程对象各状态之间的切换
 */
public class TestDemo {
    public static void main(String[] args) {
        Context context = new Context();

        context.setState(new FreeState());

        context.setState(new BookedState());
    }
}
