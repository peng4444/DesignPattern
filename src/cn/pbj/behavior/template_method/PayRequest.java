package cn.pbj.behavior.template_method;

import java.util.Scanner;

public class PayRequest {

    public PayRequest() {
        System.out.println("支付请求");
    }

    public static String  getBankCode(){
        System.out.println("请输入银行名称：CMB or CCB");
        Scanner sc = new Scanner(System.in);
        String bankname = sc.nextLine();
        return bankname;
    }
}
