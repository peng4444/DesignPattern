package cn.pbj.createmodles.singletion;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
    测试懒汉单例模式（如何防止反射和反序列化）
 */
public class SingletonDemo6 implements Serializable {

    private static SingletonDemo6 instance;

    private SingletonDemo6(){ //私有化构造器
        //防止反射创造多个对象
        if (instance!=null){
            throw new RuntimeException();
        }
    }

    public static SingletonDemo6 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo6();
        }
        return instance;
    }

    //破解反序列化创建多个对象，反序列化时，直接调用这个方法，不需要单独再创建对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
