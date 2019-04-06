package cn.pbj.behavior.chain_of_responsibility;

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        super();
        this.name = name;
    }
    //设定责任链上的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }
    //处理请求的核心的业务方法
    public abstract void handleRequest(LeaveRequest leaveRequest);
}
