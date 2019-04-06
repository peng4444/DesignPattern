package cn.pbj.structure.proxy.static_proxy;

public class ProxyStar implements Star {
    private Star star;
    public ProxyStar (Star star){
        super();
        this.star = star;
    }
    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    @Override
    public void sing() {
        /*System.out.println("SuperStar.sing()");代理star不能唱歌*/
        star.sing();
    }

    @Override
    public void getMoney() {
        System.out.println("ProxyStar.getMoney()");
    }
}
