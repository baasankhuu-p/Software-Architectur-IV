package Lab11_1;
//Сургалтын алба
public class Department_Train extends Leave_Approval{
    @Override
    public void approveLeave(Student_Leave leave) {
        if(leave.getLeave()>60){
            System.out.println("Сургалтын алба чөлөө олголоо");
        }
        else{
            nextLeaveApproval.approveLeave(leave);
        }
    }
}
