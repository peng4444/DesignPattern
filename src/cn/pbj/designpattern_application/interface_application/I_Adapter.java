package cn.pbj.designpattern_application.interface_application;

/**
 * 适配器模式
 * 适配器模式的思想是，针对调用者的需求对原有的接口进行转接。
 * 生活当中最常见的适配器就是HDMI线，可以同时发送音频和视频信号。
 * Coach接口中定义了两个方法（defend()和attack()），如果类直接实现该接口的话，就需要对两个方法进行实现。
 * 如果我们只需要对其中一个方法进行实现的话，就可以使用一个抽象类作为中间件，
 * 即适配器（AdapterCoach），用这个抽象类实现接口，并对抽象类中的方法置空（方法体只有一对花括号）
 * 这时候，新类就可以绕过接口，继承抽象类，我们就可以只对需要的方法进行覆盖，而不是接口中的所有方法。
 */
interface Coach_1 {
    void defend();
    void attack();
}

// 抽象类实现接口，并置空方法
abstract class AdapterCoach implements Coach_1{
    public void defend() {};
    public void attack() {};
}

// 新类继承适配器
class Hesa extends AdapterCoach {
    public void defend() {
        System.out.println("防守赢得冠军");
    }
}
public class I_Adapter {
    public static void main(String[] args) {
        Coach_1 coach = new Hesa();
        coach.defend();
    }
}
