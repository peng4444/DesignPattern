package cn.pbj.designpattern_application.interface_application;

/**
 * 抽象类
 * 在Java中，通过关键字abstract定义的类叫做抽象类。Java是一门面向对象的语言，因此所有的对象
 * 都是通过类来描述的；但反过来，并不是所有的类都是用来描述对象的，抽象类就是其中的一种。
 * 好了，对于抽象类我们简单总结一下：
 * 1、抽象类不能被实例化。
 * 2、抽象类应该至少有一个抽象方法，否则它没有任何意义。
 * 3、抽象类中的抽象方法没有方法体。
 * 4、抽象类的子类必须给出父类中的抽象方法的具体实现，除非该子类也是抽象类。
 */
abstract class ACoach{
    public abstract void defend();

    public abstract void attack();
}

/**
 * 在一个抽象类中，至少有一个抽象方法（通过关键字abstract定义的方法，并且没有方法体，
 * 如上例中的defend()方法和attack()方法），否则就没有必要称之为抽象类。
 * 需要注意的是，抽象类是不能实例化的！ 它需要被一个子类继承，就像以下示例那样
 */
class Hesai extends ACoach{

    @Override
    public void defend() {
        System.out.println("防守赢得冠军");
    }

    @Override
    public void attack() {
        System.out.println("控球就是一把双刃剑");
    }
}
public class Abstract_Demo {
    public static void main(String[] args) {
        ACoach moliniao = new Hesai();
        moliniao.attack();
        moliniao.defend();
    }
}
