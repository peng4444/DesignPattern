package cn.pbj.behavior.strategy;

public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double strandardPrice) {
        System.out.println("小批量老客户，打折，原价*0.85");
        return strandardPrice*0.85;
    }
}
