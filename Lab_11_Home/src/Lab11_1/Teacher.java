package Lab11_1;
//Багш
public class Teacher extends Leave_Approval{
    @Override
    public void approveLeave(Student_Leave leave) {
        if(leave.getLeave()==1){
            System.out.println("Багш чөлөө олголоо");
        }
        else{
            nextLeaveApproval.approveLeave(leave);
        }
    }
}
