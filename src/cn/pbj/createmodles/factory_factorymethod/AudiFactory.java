package cn.pbj.createmodles.factory_factorymethod;

public class AudiFactory implements CarFactory {


    @Override
    public Car craeteFactory() {
        return new Audi();
    }
}
