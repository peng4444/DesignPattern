package cn.pbj.behavior.memento;

/**
 * 源发器类 Originator（发起者）：记录当前的状态，负责创建和恢复备忘录
 */
public class Emp {
    private String ename;
    private int age;
    private double salary;

    //进行备忘录操作，并且返回备忘录对象
    public EmpMemento memento(){
        return new EmpMemento(this);
    }

    //进行数据恢复。恢复成制定备忘录的值
    public void recovery(EmpMemento empMemento){
        this.ename = empMemento.getEname();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
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

    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }
}
