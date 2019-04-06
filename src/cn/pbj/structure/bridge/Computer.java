package cn.pbj.structure.bridge;

/**
 * 桥接模式
 * 问题引出：多层继承结构
 * 问题：
 * 扩展性问题(类个数膨胀问题)：
 * 如果要增加一个新的电脑类型:智能手机，则要增加各个品牌下面的类。
 * 如果要增加一个新的品牌，也要增加各种电脑类型的类。
 * 违反单一职责原则：
 * 一个类：联想笔记本，有两个引起这个类变化的原因
 * 场景分析
 * 商城系统中常见的商品分类，以电脑为类，如何良好的处理商品分类销售的问题?
 * 这个场景中有两个变化的维度：电脑类型、电脑品牌。
 * 桥接模式核心要点：
 * 处理多层继承结构，处理多维度变化的场景，将各个维度设计成独立的继承结构，
 * 使各个维度可以独立的扩展在抽象层建立关联。
 */
public interface Computer {
    void sale();
}

class Desktop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}

class Laptop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}

class Pad implements  Computer{

    @Override
    public void sale() {
        System.out.println("销售iPad");
    }
}

class LenovoDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售联想台式机");
    }
}

class LenovoLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售联想笔记本");
    }
}

class LenovoPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售联想IPad");
    }
}
