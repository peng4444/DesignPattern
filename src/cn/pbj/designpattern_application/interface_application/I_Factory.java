package cn.pbj.designpattern_application.interface_application;

/**
 * 工厂模式
 * 所谓的工厂模式理解起来也不难，就是什么工厂生产什么，比如说宝马工厂生产宝马，奔驰工厂生产奔驰，
 * A级学院毕业A级教练，C级学院毕业C级教练。
 * 有两个接口，一个是Coach（教练），可以command()（指挥球队）；另外一个是CoachFactory（教练学院），能createCoach()（教出一名优秀的教练）。然后ACoach类实现Coach接口，ACoachFactory类实现CoachFactory接口；CCoach类实现Coach接口，CCoachFactory类实现CoachFactory接口。当需要A级教练时，就去找A级教练学院；当需要C级教练时，就去找C级教练学院。
 * 依次类推，我们还可以用BCoach类实现Coach接口，BCoachFactory类实现CoachFactory接口，从而不断地丰富教练的梯队
 */
// 教练
interface Coach_F {
    void command();
}

// 教练学院
interface CoachFactory {
    Coach_F createCoach();
}

// A级教练
class A_Coach implements Coach_F {

    @Override
    public void command() {
        System.out.println("我是A级证书教练");
    }

}

// A级教练学院
class ACoachFactory implements CoachFactory {

    @Override
    public Coach_F createCoach() {
        return new A_Coach();
    }

}

// C级教练
class CCoach implements Coach_F {

    @Override
    public void command() {
        System.out.println("我是C级证书教练");
    }

}

// C级教练学院
class CCoachFactory implements CoachFactory {

    @Override
    public Coach_F createCoach() {
        return new CCoach();
    }

}
public class I_Factory {
    public static void create(CoachFactory factory) {
        factory.createCoach().command();
    }

    public static void main(String[] args) {
        // 对于一支球队来说，需要什么样的教练就去找什么样的学院
        // 学院会介绍球队对应水平的教练。
        create(new ACoachFactory());
        create(new CCoachFactory());
    }
}
