package cn.pbj.designpattern_application.interface_application;

/**
 * 接口（英文：Interface），在Java中是一个抽象类型，是抽象方法的集合；
 * 接口通过关键字interface来定义。接口与抽象类的不同之处在于：
 * 1、抽象类可以有方法体的方法，但接口没有。
 * 2、接口中的成员变量隐式为static final，但抽象类不是的。
 * 3、一个类可以实现多个接口，但只能继承一个抽象类。
 */

interface Coach_Plus{
    void defend();
    void attack();
}

interface  Hero{
    void fight();
}
/**
 * 接口是隐式抽象的，所以声明时没有必要使用abstract关键字；接口的每个方法都是隐式抽象的，
 * 所以同样不需要使用abstract关键字；接口中的方法都是隐式public的。
 * 和抽象类一样，接口也不能直接被实例化，它需要一个类来实现它，就像以下示例展示那样
 */
class I_Hesai_Plus implements Coach_Plus,Hero{

    @Override
    public void defend() {
        System.out.println("防守赢得冠军");
    }

    @Override
    public void attack() {
        System.out.println("控球就是一把双刃剑");
    }

    @Override
    public void fight() {
        System.out.println("只要一息尚存，就应该战斗到最后");
    }
}

/**
 * 创建的Hesai对象可以向上转型为Coach和Hero，然后调用各自接口中实现的具体方法，
 * 因为Hesai这个类同时实现了两个接口，分别是Coach和Hero（class Hesai implements Coach, Hero，接口之间通过英文逗号隔开）
 */
public class Interface_Demo_Plus {
    public static void defend(Coach_Plus coach) {
        coach.defend();
    }

    public static void fight(Hero hero) {
        hero.fight();
    }
    public static void main(String[] args) {
        I_Hesai_Plus moliniao = new I_Hesai_Plus();
        defend(moliniao);
        fight(moliniao);
    }

}
