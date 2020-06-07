package cn.pbj.behavior.memento;

/**
 * 负责人 Caretaker（管理者）：负责管理备忘录对象
 */
public class CareTaker {
    private EmpMemento empMemento;

//    private List<EmpMemento> list = new ArrayList<>();  //可以添加好多个的备忘录点对象 可以通过增加容器，设置多个“备忘点”

    /**
     * 备忘点较多时：
     * 将备忘录压栈
     *public class CareTaker {
     * 	private Memento memento;
     * 	private Stack<Memento> stack = new Stack<Memento>();
     * }
     * 将多个备忘录对象，序列化和持久化
     * @return
     */
    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}
