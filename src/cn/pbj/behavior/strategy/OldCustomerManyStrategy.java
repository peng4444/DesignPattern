package cn.pbj.behavior.strategy;

public class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double strandardPrice) {
        System.out.println("大批量老客户，打折，原价*0.80");
        return strandardPrice*0.80;
    }
}
