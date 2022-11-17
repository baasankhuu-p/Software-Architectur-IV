package Lab11_1;
//Тэнхимийн эрхлэгч
public class Department_Management extends Leave_Approval{
    @Override
    public void approveLeave(Student_Leave leave) {
        if(leave.getLeave()<=7){
            System.out.println("Тэнхимийн эрхлэгч чөлөө олголоо");
        }
        else{
            nextLeaveApproval.approveLeave(leave);
        }
    }
}
