package cn.pbj.createmodles.factoryabstractfactory;

public interface Seat {
    void message();
}

class LuxurySeat implements Seat{

    @Override
    public void message() {
        System.out.println("seat sofe...");
    }
}

class LowSeat implements Seat{

    @Override
    public void message() {
        System.out.println("seat hard...");
    }
}
