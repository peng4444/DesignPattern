package cn.pbj.behavior.chain_of_responsibility;

//经理
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<10){
            System.out.println("员工："+leaveRequest.getEmpName()+
                    "请假："+leaveRequest.getLeaveDays()+"原因："+leaveRequest.getReason());
            System.out.println("经理："+this.name+"审批通过");
        }else{
            if (this.nextLeader!=null){
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
