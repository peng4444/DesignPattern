package cn.pbj.createmodles.factoryabstractfactory;

public interface Tyre {
    void revolve();
}

class LuxuryTyre implements  Tyre{


    @Override
    public void revolve() {
        System.out.println(" revolve fast...");
    }
}

class LowTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("revolve slow...");
    }
}
