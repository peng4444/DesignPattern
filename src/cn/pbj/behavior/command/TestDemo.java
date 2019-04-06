package cn.pbj.behavior.command;

/**
 * 命令模式：将一个请求封装为一个对象，从而使我们可用不同的请求对客户进行参数化；
 * 对请求排队或者记录请求日志，以及支持可撤销的操作。也称之为：动作Action模式、事务transaction模式
 * 结构：
 * Command抽象命令类
 * ConcreteCommand具体命令类
 * Invoker调用者/请求者
 * 请求的发送者，它通过命令对象来执行请求。一个调用者并不需要在设计时确定其接收者，
 * 因此它只与抽象命令类之间存在关联。在程序运行时，将调用命令对象的execute()，间接调用接收者的相关操作。
 * Receiver接收者
 * 接收者执行与请求相关的操作，具体实现对请求的业务处理。
 * 未抽象前，实际执行操作内容的对象。
 * Client客户类
 * 在客户类中需要创建调用者对象、具体命令类对象，在创建具体命令对象时指定对应的接收者。
 * 发送者和接收者之间没有直接关系，都通过命令对象间接调用。
 * 开发中常见的场景：
 * Struts2中，action的整个调用过程中就有命令模式。
 * 数据库事务机制的底层实现
 * 命令的撤销和恢复
 */
public class TestDemo {
    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());

        Invoker i = new Invoker(command);

        i.call();

        //new Receiver().action();
    }

}
