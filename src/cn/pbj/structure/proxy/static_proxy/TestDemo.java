package cn.pbj.structure.proxy.static_proxy;

/**
 * 静态代理
 */
public class TestDemo {
    public static void main(String args[]) {

        Star real = new SuperStar();
        Star proxyreal = new ProxyStar(real);

        proxyreal.confer();
        proxyreal.signContract();
        proxyreal.bookTicket();
        proxyreal.sing();

        proxyreal.getMoney();
    }
}
