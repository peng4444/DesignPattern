package cn.pbj.behavior.mediator;

public class Development implements Department {

    private Mediator mediator;//持有中介者的（总经理）的引用

    public Development(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研，开发项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，没钱了，需要资金支持");
    }
}
