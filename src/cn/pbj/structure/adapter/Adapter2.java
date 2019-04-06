package cn.pbj.structure.adapter;

/**
 * 适配器本身(对象适配器模式，使用了组合的方式被适配对象整合)
 * 相当于USB和ps/2的转接器
 */
public class Adapter2 implements Target {

    private  Adaptee adaptee;

    @Override
    public void handleReq() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee){
        super();
        this.adaptee = adaptee;
    }
}
