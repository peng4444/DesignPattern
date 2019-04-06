package cn.pbj.structure.adapter;

/**
 * 适配器本身(类适配器模式，只能继承一个类)
 * 相当于USB和ps/2的转接器
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void handleReq() {
        super.request();
    }
}
