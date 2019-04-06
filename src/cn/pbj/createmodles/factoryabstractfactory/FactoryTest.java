package cn.pbj.createmodles.factoryabstractfactory;

public class FactoryTest {
    public static void main(String args[]){
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.craeteEngine();
        e.run();
        e.start();
    }
}
