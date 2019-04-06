package cn.pbj.structure.decorator;

/**
 * 抽象组件
 */
public interface MyCar {
    void move();
}

/**
 * 实现细节：
 * Component抽象构件角色：
 * 真实对象和装饰对象有相同的接口。这样，客户端对象就能够以与真实对象相同的方式同装饰对象交互。
 * ConcreteComponent 具体构件角色(真实对象)：
 * io流中的FileInputStream、FileOutputStream
 * Decorator装饰角色：
 * 持有一个抽象构件的引用。装饰对象接受所有客户端的请求，并把这些请求转发给真实的对象。
 * 这样，就能在真实对象调用前后增加新的功能。
 * ConcreteDecorator具体装饰角色：
 * 负责给构件对象增加新的责任。
 */
//ConcreteComponent 具体构件对象（真实对象）
class Car implements MyCar{


    @Override
    public void move() {
        System.out.println("地上跑。。");
    }
}

//Decorator装饰角色：
class SuperCar implements MyCar{

    private MyCar car;

    public SuperCar(MyCar car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

//ConcreteDecorator具体装饰角色：
class FlyCar extends SuperCar{

    public FlyCar(MyCar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞。。。的新功能");
    }
    @Override
    public void move() {
        super.move();
        fly();
    }
}

//ConcreteDecorator具体装饰角色：
class WaterCar extends SuperCar{

    public WaterCar(MyCar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水上漂。。。的新功能");
    }
    @Override
    public void move() {
        super.move();
        swim();
    }
}

//ConcreteDecorator具体装饰角色：
class AICar extends SuperCar{

    public AICar(MyCar car) {
        super(car);
    }

    public void what(){
        System.out.println("everything。。。的新功能");
    }
    @Override
    public void move() {
        super.move();
        what();
    }
}