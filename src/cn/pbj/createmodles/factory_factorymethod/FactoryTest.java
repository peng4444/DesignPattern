package cn.pbj.createmodles.factory_factorymethod;

/**
 * 工厂方法模式要点：
 * 为了避免简单工厂模式的缺点，不完全满足OCP。
 * 工厂方法模式和简单工厂模式最大的不同在于，简单工厂模式只有一个（对于一个项目或者一个独立模块而言）
 * 工厂类，而工厂方法模式有一组实现了相同接口的工厂类。
 */
public class FactoryTest {
    public static void main(String args[]){
        Car c1 = new AudiFactory().craeteFactory();
        Car c2 = new BydFactory().craeteFactory();

        c1.run();
        c2.run();

        Car c3 = new BenzFactory().craeteFactory();
        c3.run();
    }
}
