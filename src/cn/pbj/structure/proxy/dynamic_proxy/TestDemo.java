package cn.pbj.structure.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理 JDK动态代理
 * 动态代理相比于静态代理的优点
 * 抽象角色中(接口)声明的所以方法都被转移到调用处理器一个集中的方法中处理，
 * 这样，我们可以更加灵活和统一的处理众多的方法。
 */
public class TestDemo {
    public static void main(String args[]){
        Star real = new SuperStar();
         StarHandler starHandler = new StarHandler(real);

         Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},starHandler);

         proxy.sing();
    }
}
