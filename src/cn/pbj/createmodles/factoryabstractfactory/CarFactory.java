package cn.pbj.createmodles.factoryabstractfactory;

public interface CarFactory {
    Engine  craeteEngine();
    Seat createSeat();
    Tyre createTyre();
}

class LuxuryCarFactory implements  CarFactory{

    @Override
    public Engine craeteEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}

class LowCarFactory implements CarFactory{

    @Override
    public Engine craeteEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}