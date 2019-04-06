package cn.pbj.behavior.mediator;

public class Market implements Department {

    private Mediator mediator;//持有中介者的（总经理）的引用

    public Market(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("跑去接项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，项目承接的进度，需要资金支持");

        mediator.command("finacial");
    }
}
