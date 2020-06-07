package cn.pbj.structure.proxy;

/**
 * @ClassName: OrderDaoImpl
 * @Author: pbj
 * @Date: 2020/5/31 11:34
 * @Description: TODO
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
