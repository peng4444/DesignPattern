package cn.pbj.behavior.template_method;

public class AgreementCMBPay extends AgreementBasePay {
    @Override
    public PayResponse payInChannel(PayRequest request) {
        System.out.println("去招商银行支付");
        return new PayResponse();
    }
}
