package cn.pbj.behavior.chain_of_responsibility;

/**
 * 责任链模式
 * 将能够处理同一类请求的对象连成一条链，所提交的请求沿着链传递，链上的对象逐个判断是否有能力处理该请求，
 * 如果能则处理，如果不能则传递给链上的下一个对象。
 * 添加新的处理对象：
 * 由于责任链的创建完全在客户端，因此新增新的具体处理者对原有类库没有任何影响，
 * 只需添加新的类，然后在客户端调用时添加即可。符合开闭原则。
 * 非链表方式实现职责链
 * 通过集合、数组生成职责链更加实用！实际上，很多项目中，每个具体的Handler并不是由开发团队定义的，
 * 而是项目上线后由外部单位追加的，所以使用链表方式定义COR链就很困难。
 * 开发中常见的场景：
 * Java中，异常机制就是一种责任链模式。一个try可以对应多个catch，当第一个catch不匹配类型，则自动跳到第二个catch.
 * Javascript语言中，事件的冒泡和捕获机制。Java语言中，事件的处理采用观察者模式。
 * Servlet开发中，过滤器的链式处理
 * Struts2中，拦截器的调用也是典型的责任链模式
 */
public class TestDemo {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        //组织责任链关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假操作
        LeaveRequest request1 = new LeaveRequest("TOM",10,"come back home");
        a.handleRequest(request1);
    }
}
