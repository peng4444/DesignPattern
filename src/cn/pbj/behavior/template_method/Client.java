package cn.pbj.behavior.template_method;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.cnblogs.com/goodAndyxublog/p/10146442.html
 * 从源码学习设计模式之模板方法
 * 模板方法模式介绍：
 * 模板方法模式是编程中经常用得到模式。它定义了一个操作中的算法骨架，将某些步骤延迟到子类中实现。
 * 这样，新的子类可以在不改变一个算法结构的前提下重新定义该算法的某些特定步骤。
 * 核心：
 * 处理某个流程的代码已经都具备，但是其中某个节点的代码暂时不能确定。因此，我们采用工厂方法模式，
 * 将这个节点的代码实现转移给子类完成。即：处理步骤父类中定义好，具体实现延迟到子类中定义
 * 什么时候用到模板方法模式：
 * 实现一个算法时，整体步骤很固定。但是，某些部分易变。易变部分可以抽象成出来，供子类实现。
 * 开发中常见的场景：
 * 非常频繁。各个框架、类库中都有他的影子。比如常见的有：
 * 数据库访问的封装
 * Junit单元测试
 * servlet中关于doGet/doPost方法调用
 * Hibernate中模板程序
 * spring中JDBCTemplate、HibernateTemplate等。
 */
public class Client {

//    public static void main(String[] args) {
//        System.out.println("使用招商银行支付");
//        AgreementPay agreementPay = new AgreementCMBPay();
//        PayRequest request = new PayRequest();
//        agreementPay.payInChannel(request);
//
//        System.out.println("使用建设银行支付");
//        agreementPay = new AgreementCCBPay();
//        agreementPay.payInChannel(request);
//    }

    public static Map<String, AgreementPay> payCache = new HashMap<>();

    static {
        payCache.put("CMB", new AgreementCMBPay());
        payCache.put("CCB", new AgreementCCBPay());
    }


    public static void main(String[] args) {
        PayRequest request = new PayRequest();
        AgreementPay pa;
        switch (request.getBankCode()) {
            case "CMB":
                pa = payCache.get("CMB");
                pa.payInChannel(request);
                break;
            case "CCB":
                pa = payCache.get("CCB");
                pa.payInChannel(request);
                break;
            default:
                throw new RuntimeException();
        }

    }
}
