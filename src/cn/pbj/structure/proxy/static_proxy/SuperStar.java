package cn.pbj.structure.proxy.static_proxy;

public class SuperStar implements Star {
    @Override
    public void confer() {
        System.out.println("SuperStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("SuperStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("SuperStar.bookTicket()");
    }

    @Override
    public void sing() {
        System.out.println("SuperStar.真人sing()");
    }

    @Override
    public void getMoney() {
        System.out.println("SuperStar.getMoney()");
    }
}
