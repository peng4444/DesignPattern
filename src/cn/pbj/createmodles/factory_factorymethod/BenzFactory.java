package cn.pbj.createmodles.factory_factorymethod;

public class BenzFactory implements CarFactory {
    @Override
    public Car craeteFactory() {
        return new Benz();
    }
}
