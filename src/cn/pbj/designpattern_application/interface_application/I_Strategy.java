package cn.pbj.designpattern_application.interface_application;

/**
 * 策略模式
 * 策略模式的思想是，针对一组算法，将每一种算法封装到具有共同接口的实现类中，
 * 接口的设计者可以在不影响调用者的情况下对算法做出改变
 * Demo.defend()方法可以接受不同风格的Coach，并根据所传递的参数对象的不同而产生不同的行为，这被称为“策略模式”
 */
// 接口：教练
interface Coach {
    // 方法：防守
    void defend();
}

// 何塞·穆里尼奥
class Hesai_one implements Coach {

    @Override
    public void defend() {
        System.out.println("防守赢得冠军");
    }
}

// 德普·瓜迪奥拉
class Guatu implements Coach {

    @Override
    public void defend() {
        System.out.println("进攻就是最好的防守");
    }
}
public class I_Strategy {
    // 参数为接口
    public static void defend(Coach coach) {
        coach.defend();
    }

    public static void main(String[] args) {
        // 为同一个方法传递不同的对象
        defend(new Hesai_one());
        defend(new Guatu());
    }
}
