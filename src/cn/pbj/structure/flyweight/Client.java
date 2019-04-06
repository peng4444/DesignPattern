package cn.pbj.structure.flyweight;

/**
 * 场景：
 * 内存属于稀缺资源，不要随便浪费。如果有很多个完全相同或相似的对象，我们可以通过享元模式，节省内存。
 * 核心：
 * 享元模式以共享的方式高效地支持大量细粒度对象的重用。
 * 享元对象能做到共享的关键是区分了内部状态和外部状态。
 * 内部状态：可以共享，不会随环境变化而改变
 * 外部状态：不可以共享，会随环境变化而改变
 * 享元模式实现：
 * FlyweightFactory享元工厂类
 * 创建并管理享元对象，享元池一般设计成键值对
 * FlyWeight抽象享元类
 * 通常是一个接口或抽象类，声明公共方法，这些方法可以向外界提供对象的内部状态，设置外部状态。
 * ConcreteFlyWeight具体享元类
 * 为内部状态提供成员变量进行存储
 * UnsharedConcreteFlyWeight非共享享元类
 * 不能被共享的子类可以设计为非共享享元类
 * 享元模式开发中应用的场景：
 * 享元模式由于其共享的特性，可以在任何“池”中操作，比如：线程池、数据库连接池。
 * String类的设计也是享元模式
 * 优点
 * 极大减少内存中对象的数量
 * 相同或相似对象内存中只存一份，极大的节约资源，提高系统性能
 * 外部状态相对独立，不影响内部状态
 * 缺点
 * 模式较复杂，使程序逻辑复杂化
 * 为了节省内存，共享了内部状态，分离出外部状态，而读取外部状态使运行时间变长。用时间换取了空间。
 */
public class Client {
	public static void main(String[] args) {
		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
		System.out.println(chess1);
		System.out.println(chess2);
		
		System.out.println("增加外部状态的处理===========");
		chess1.display(new Coordinate(10, 10));
		chess2.display(new Coordinate(20, 20));
		
		
	}
}
