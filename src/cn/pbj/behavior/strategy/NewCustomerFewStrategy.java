package cn.pbj.behavior.strategy;

public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double strandardPrice) {
        System.out.println("小批量新客户，不打折，原价");
        return strandardPrice;
    }
}
