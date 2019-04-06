package cn.pbj.behavior.template_method;

public class AgreementCCBPay extends AgreementBasePay {
    @Override
    public PayResponse payInChannel(PayRequest request) {
        System.out.println("去建设银行支付");
        return new PayResponse();
    }
}
