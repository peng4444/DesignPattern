package cn.pbj.structure.proxy;

/**
 * @ClassName: OrderServiceImpl
 * @Author: pbj
 * @Date: 2020/5/31 11:35
 * @Description: TODO
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;
    @Override
    public int saveOrder(Order order) {
        //模拟自动注入
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
