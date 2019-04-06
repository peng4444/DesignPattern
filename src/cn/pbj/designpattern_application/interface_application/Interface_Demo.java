package cn.pbj.designpattern_application.interface_application;

/**
 * 接口（英文：Interface），在Java中是一个抽象类型，是抽象方法的集合；
 * 接口通过关键字interface来定义。接口与抽象类的不同之处在于：
 * 1、抽象类可以有方法体的方法，但接口没有。
 * 2、接口中的成员变量隐式为static final，但抽象类不是的。
 * 3、一个类可以实现多个接口，但只能继承一个抽象类。
 */

interface ICoach{
    void defend();
    void attack();
}

/**
 * 接口是隐式抽象的，所以声明时没有必要使用abstract关键字；接口的每个方法都是隐式抽象的，
 * 所以同样不需要使用abstract关键字；接口中的方法都是隐式public的。
 * 和抽象类一样，接口也不能直接被实例化，它需要一个类来实现它，就像以下示例展示那样
 */
class I_Hesai implements ICoach{

    @Override
    public void defend() {
        System.out.println("防守赢得冠军");
    }

    @Override
    public void attack() {
        System.out.println("控球就是一把双刃剑");
    }
}
public class Interface_Demo {
    public static void main(String[] args) {
        ICoach I_moliniao = new I_Hesai();
        I_moliniao.attack();
        I_moliniao.defend();
    }

}
