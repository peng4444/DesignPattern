package cn.pbj.behavior.memento;

/**
 * 核心
 * 就是保存某个对象内部状态的拷贝，这样以后就可以将该对象恢复到原先的状态。
 * 结构：
 * 源发器类Originator
 * 备忘录类Memento
 * 负责人类CareTaker
 *开发中常见的应用场景：
 * 棋类游戏中的，悔棋
 * 普通软件中的，撤销操作
 * 数据库软件中的，事务管理中的，回滚操作
 * Photoshop软件中的，历史记录
 */
public class TestDemo {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Emp emp = new Emp("aaa",18,20000);
        System.out.println("第一次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        careTaker.setEmpMemento(emp.memento());//备忘录一次

        emp.setAge(22);
        emp.setEname("CCC");
        emp.setSalary(30000);
        System.out.println("第二次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        emp.recovery(careTaker.getEmpMemento());//恢复到备忘录保存的对象状态
        System.out.println("第三次打印对象（第一次的恢复对象）："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
    }
}
