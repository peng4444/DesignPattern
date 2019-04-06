package cn.pbj.createmodles.factory_simplefactory;

/**
 * 简单工厂模式也叫静态工厂模式，就是工厂类一般是使用静态方法，通过接收的参数的不同来返回不同的对象实例。
 * 对于增加新产品无能为力！不修改代码的话，是无法扩展的。
 */
public class CarFactory_2 {

    public static Car createAudi(){
        return new Audi();
    }

    public static Car creatByd(){
        return new Byd();
    }
}
