package cn.pbj.structure.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

    Star realStar;
    public StarHandler(Star realStar){
        super();
        this.realStar = realStar;

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object obj =null;

        System.out.println("真正的方法执行以前");
        System.out.println("代理在帮助superstar处理。。。  ");
        if (method.getName().equals("sing")){
             obj = method.invoke(realStar,args);
        }
        System.out.println("真正的方法执行以后");
        System.out.println("代理正在帮助supers处理。。。");
        return obj;
    }
}
