package cn.pbj.behavior.mediator;

public class Finacial implements Department {

    private Mediator mediator;//持有中介者的（总经理）的引用

    public Finacial(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心数钱");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，钱太多，不知道怎么花");
    }
}
