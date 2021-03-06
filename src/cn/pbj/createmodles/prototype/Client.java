package cn.pbj.createmodles.prototype;

import java.util.Date;

/**
 * 测试原型模式
 * 原型模式：
 * 通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
 * 就是java中的克隆技术，以某个对象为原型，复制出新的对象。显然，新的对象具备原型对象的特点
 * 优势有：效率高(直接克隆，避免了重新执行构造过程步骤) 。
 * 克隆类似于new，但是不同于new。new创建新的对象属性采用的是默认值。
 * 克隆出的对象的属性值完全和原型对象相同。并且克隆出的新对象改变不会影响原型对象。
 * 然后，再修改克隆对象的值。
 * 原型模式实现：
 * Cloneable接口和clone方法
 * Prototype模式中实现起来最困难的地方就是内存复制操作，所幸在Java中提供了clone()方法替我们做了
 * 绝大部分事情。
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅克隆
        Sheep s1 = new Sheep("shoali", new Date(122334209L));
        System.out.println(s1);
        System.out.println(s1.getSheepName());
        System.out.println(s1.getSheepBirthday());

        Sheep s2 = (Sheep) s1.clone();
        s2.setSheepName("duoli");
        System.out.println(s2);
        System.out.println(s2.getSheepName());
        System.out.println(s2.getSheepBirthday());

        /**
         * 浅克隆存在的问题
         * 被复制的对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用都仍然指向
         * 原来的对象。
         * 深克隆如何实现?
         * 深克隆把引用的变量指向复制过的新对象，而不是原有的被引用的对象。
         * 深克隆：让已实现Clonable接口的类中的属性也实现Clonable接口
         * 基本数据类型和String能够自动实现深度克隆（值的复制）
         */
    }
}
