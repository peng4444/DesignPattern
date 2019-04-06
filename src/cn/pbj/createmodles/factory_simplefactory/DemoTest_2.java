package cn.pbj.createmodles.factory_simplefactory;

/*
    测试简单工厂模式的情况下
 */
public class DemoTest_2 {
    public static void main (String args[]){
        Car c1 = CarFactory.createCar("audi");
        Car c2 = CarFactory.createCar("byd");
        c1.run();
        c2.run();
    }
}
