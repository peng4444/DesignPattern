package cn.pbj.createmodles.factory_factorymethod;

public class BydFactory implements CarFactory {
    @Override
    public Car craeteFactory() {
        return new Byd();
    }
}
