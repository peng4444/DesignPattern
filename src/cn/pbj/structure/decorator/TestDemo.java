package cn.pbj.structure.decorator;

/**
 * 装饰模式(decorator)
 * 职责：
 * 动态的为一个对象增加新的功能。
 * 装饰模式是一种用于代替继承的技术，无须通过继承增加子类就能扩展对象的新功能。
 * 使用对象的关联关系代替继承关系，更加灵活，同时避免类型体系的快速膨胀。
 * 开发中使用的场景：
 * IO中输入流和输出流的设计
 * Swing包中图形界面构件功能
 * Servlet API 中提供了一个request对象的Decorator设计模式的默认实现类HttpServletRequestWrapper，HttpServletRequestWrapper 类，增强了request对象的功能。
 * Struts2中，request，response,session对象的处理
 *
 * IO流实现细节：
 * Component抽象构件角色：
 *  io流中的InputStream、OutputStream、Reader、Writer
 * ConcreteComponent 具体构件角色：
 * io流中的FileInputStream、FileOutputStream
 * Decorator装饰角色：
 * 持有一个抽象构件的引用：io流中的FilterInputStream、FilterOutputStream
 * ConcreteDecorator具体装饰角色：
 * 负责给构件对象增加新的责任。Io流中的BufferedOutputStream、BufferedInputStream等。
 */
public class TestDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新功能：飞行。。。");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加新功能：水上漂。。。");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加新功能：天上飞——水上漂。。。");
        WaterCar fly_waterCar = new WaterCar(flyCar);
        fly_waterCar.move();

        System.out.println("天下无敌的car：");
//        AICar aiCar = new AICar(fly_waterCar);
        AICar aiCar = new AICar(new WaterCar(flyCar));
        aiCar.move();
    }
    /**
     * 总结：
     * 装饰模式（Decorator）也叫包装器模式（Wrapper）
     * 装饰模式降低系统的耦合度，可以动态的增加或删除对象的职责，并使得需要装饰的具体构建类
     * 和具体装饰类可以独立变化，以便增加新的具体构建类和具体装饰类。
     * 优点
     * 扩展对象功能，比继承灵活，不会导致类个数急剧增加
     * 可以对一个对象进行多次装饰，创造出不同行为的组合，得到功能更加强大的对象
     * 具体构建类和具体装饰类可以独立变化，用户可以根据需要自己增加新的具体构件子类和具体装饰子类。
     * 缺点
     * 产生很多小对象。大量小对象占据内存，一定程度上影响性能。
     * 装饰模式易于出错，调试排查比较麻烦。
     * 装饰模式和桥接模式的区别：
     * 两个模式都是为了解决过多子类对象问题。但他们の诱因不一样。
     * 桥模式是对象自身现有机制沿着多个维度变化，是既有部分不稳定。装饰模式是为了增加新的功能。
     */
}
