package cn.pbj.behavior.chain_of_responsibility;

//经理
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<30){
            System.out.println("员工："+leaveRequest.getEmpName()+
                    "请假："+leaveRequest.getLeaveDays()+"原因："+leaveRequest.getReason());
            System.out.println("总经理："+this.name+"审批通过");
        }else{
            System.out.println("小子"+leaveRequest.getEmpName()+"不想干了，居然请假"+leaveRequest.getLeaveDays());
        }
    }
}
