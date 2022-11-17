package Lab11_1;

public abstract class Leave_Approval {
    protected Leave_Approval nextLeaveApproval;
    public void setNextLeaveApproval(Leave_Approval nextLeaveApproval) {
        this.nextLeaveApproval=nextLeaveApproval;
    }
    public abstract void approveLeave(Student_Leave Leave);
}
