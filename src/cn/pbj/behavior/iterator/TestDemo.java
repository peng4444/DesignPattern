package cn.pbj.behavior.iterator;

/**
 * 迭代器模式
 * 场景：
 * 提供一种可以遍历聚合对象的方式。又称为：游标cursor模式
 * 聚合对象：存储数据
 * 迭代器：遍历数据
 * 结构：
 * 聚合对象：存储数据
 * 迭代器：遍历数据
 * 基本案例：
 * 实现正向遍历的迭代器
 * 实现逆向遍历的迭代器
 * 开发中常见的场景：
 * JDK内置的迭代器(List/Set)
 */
public class TestDemo {
    public static void main(String[] args) {
        ConcreteMyAggregate concreteMyAggregate = new ConcreteMyAggregate();

        concreteMyAggregate.addObject("aa");
        concreteMyAggregate.addObject("bb");
        concreteMyAggregate.addObject("cc");

        MyIterator myIterator = concreteMyAggregate.createIterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.getCurrentObj());
            myIterator.next();
        }
    }
}
