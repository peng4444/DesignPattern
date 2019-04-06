package cn.pbj.behavior.template_method;

public abstract class AgreementBasePay implements AgreementPay {
    @Override
    public PayResponse payInChannel(PayRequest request) {
        checkRequest(request);
        return this.payInChannel(request);
    }

    private void checkRequest(PayRequest request) {
        System.out.println("具体方法参数检查");
    }
}
