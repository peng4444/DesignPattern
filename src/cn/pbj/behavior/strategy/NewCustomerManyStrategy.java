package cn.pbj.behavior.strategy;

public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double strandardPrice) {
        System.out.println("大批量新客户，打折，原价打九折");
        return strandardPrice*0.9;
    }
}
