package cn.pbj.behavior.command;

/**
 * 真正命令的执行者
 */
public class Receiver {
    public void action(){
        System.out.println("Command.action()");
    }
}
