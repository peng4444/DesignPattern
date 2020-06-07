package cn.pbj.behavior.memento;

/**
 * 备忘录类 Memento（备忘录）：负责存储发起者的状态，在需要的时候提供发起人需要的状态
 */
public class EmpMemento {
    private String ename;
    private int age;
    private double salary;

    public EmpMemento(Emp emp) {
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
