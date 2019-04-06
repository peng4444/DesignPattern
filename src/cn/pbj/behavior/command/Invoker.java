package cn.pbj.behavior.command;

public class Invoker {
    private Command command;
//也可以通过容器List<Command>容器容纳很多命令对象，进行批处理，数据库底层的事务管理就是类似的的结构
    public Invoker(Command command) {
        super();
        this.command = command;
    }

    //业务方法，用于调用命令类的方法
    public void call(){
        command.execute();
    }
}
