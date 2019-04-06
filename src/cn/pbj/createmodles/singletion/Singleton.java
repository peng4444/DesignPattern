package cn.pbj.createmodles.singletion;

/**
 * 什么是单例模式
 * 保证一个系统中的某个类只有一个实例而且该实例易于外界访问。例如Windows界面的任务管理器就可以看做是一个单例。
 * 单例模式的使用场景
 * 在程序中比较常用的是数据库连接池、线程池、日志对象等等。
 * 单例模式使用
 * 最早我们在学习单例模式的时候，基本都会接触这两种模式：饿汉式和饱汉式(懒汉式)。
 */

public class Singleton {

}
    /*
    饿汉式
    定义一个私有的构造方法，并将自身的实例对象设置为一个私有属性,并加上static和final修饰符，然后通过公共的静态方法调用返回实例。
    优点：写起来很简单，并且不会因为不加synchronized关键字而造成的线程不安全问题。
    类初始化时立即加载，无法延迟加载,天然线程安全
    方法没有同步，调用效率高
    缺点：当该类被加载的时候，会初始化该实例和静态变量并被创建并分配内存空间，并且会一直占用内存。
     */
    class SingletonDemo1 {
        private static SingletonDemo1 instance = new SingletonDemo1();//类初始化时立即加载,天然线程安全

        private SingletonDemo1() {

        }

        //方法没有同步，调用效率高
        public static SingletonDemo1 getInstance() {
            return instance;
        }
    }
    /*
    饱汉式
    定义一个私有的构造方法，定义一个该类静态私有的变量，然后定义一个公共的静态方法，对该类的值进行空判断，不为空直接返回，否则重新构建一个。
    延迟加载
    优点：写起来很简单，在第一次调用的时候才会初始化，节省了内存。
    缺点：线程不安全，多个线程调用可能会出现多个实例。
    总结：书写简单，线程不安全，效率还行。
     */
    class SingletonDemo2 {

        private static SingletonDemo2 instance;

        private SingletonDemo2() {//私有化构造器
        }

        public static SingletonDemo2 getInstance() {
            if (instance == null) {
                instance = new SingletonDemo2();
            }
            return instance;
        }
    }
    /*
    静态内部类
    定义一个私有的构造方法，定义一个该类私有静态的内部类，然后在内部类中定义一个该类的静态变量，
    然后通过公共的final修饰的静态方法调用返回实例。
    因为该类的内部类是私有的，除了对外公布的公共静态方法getInstance()，是无法访问的。因为它是延迟加载，
    所以读取读取实例的时候不会进行同步，几乎没有性能的缺陷，而且还是线程安全的，并且不依赖JDK的版本。
     */
    class  SingletonDemo3 {
        private SingletonDemo3(){

        }
        private static class SingletonClassInstance{
            private static SingletonDemo3 instance = new SingletonDemo3();
        }
        public static  SingletonDemo3 getInstance(){
           return SingletonClassInstance.instance;
        }
    }
    /*
    双重锁检查
    定义一个私有构造方法，通过volatile定义静态私有变量，保证了该变量的可见性，然后定义一个共有的静态方法，
    第一次对该对象实例化时与否判断，不为空直接返回，提升效率；然后使用synchronized 进行同步代码块，
    防止对象未初始化时，在多线程访问该对象在第一次创建后，再次重复的被创建；
    然后第二次对该对象实例化时与否判断，如果未初始化，则初始化，否则直接返回该实例。
    这种模式在很长的一段时间内可以说是最优的了，内存占用低，效率高，线程安全，多线程操作原子性。但是有个缺点就是书写麻烦，对新手不太友好。
     */
    class SingletonDemo4 {
        private SingletonDemo4() {
        }
        private static volatile SingletonDemo4 instance;
        public static SingletonDemo4 getInstance() {
            if (instance == null) {
                synchronized (SingletonDemo4.class) {
                    if (instance == null) {
                        instance = new SingletonDemo4();
                    }
                }
            }
            return instance;
        }
    }
    /*
    JDK1.5之后出现了枚举，并且完美支持单例模式，并且线程安全、效率高！但是这些不是最重要的，
    最重要的是书写超级简单！究竟有多简单，看下面的示例应该就可以了解一下了。。。
     枚举单例
     */

    enum SingletonDemo5{
        /*
        定义一个枚举的元素，
         */
        INSTANCE;

        //添加自己需要的元素
        public void singletonOperation(){
        }
    }
    /**
     单例模式的几种使用就到这了，那么我们来总结下使用单例模式需要注意什么(不包括枚举)。
     构造方法私有化（private）;
     定义一个私有(private)静态(static)实例化对象;
     对外提供一个公共(public)静态(static)的方法得到该实例;
     **/