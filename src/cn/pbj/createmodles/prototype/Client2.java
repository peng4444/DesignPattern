package cn.pbj.createmodles.prototype;

import java.io.*;
import java.util.Date;

/**
 * 利用序列化和反序列化技术实现深克隆！
 */
public class Client2 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
    /*深克隆如何实现?
        深克隆把引用的变量指向复制过的新对象，而不是原有的被引用的对象。
        深克隆：让已实现Clonable接口的类中的属性也实现Clonable接口
        基本数据类型和String能够自动实现深度克隆（值的复制）*/
        Date date = new Date(12312321331L);
        Sheep s1 = new Sheep("少利", date);
        System.out.println(s1);
        System.out.println(s1.getSheepName());
        System.out.println(s1.getSheepBirthday());

        //使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Sheep s2 = (Sheep) ois.readObject();   //克隆好的对象！

        System.out.println("修改原型对象的属性值");
        date.setTime(23432432423L);

        System.out.println(s1.getSheepBirthday());

        s2.setSheepName("多利");
        System.out.println(s2);
        System.out.println(s2.getSheepName());
        System.out.println(s2.getSheepBirthday());

        /**
         * 短时间大量创建对象时，原型模式和普通new方式效率测试
         * 开发中的应用场景
         * 原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的方法创建一个对象，然后由工厂方法提供给调用者。
         * spring中bean的创建实际就是两种：单例模式和原型模式。（当然，原型模式需要和工厂模式搭配起来）
         */
    }

}
