package Lab11_1;
//Чөлөө олгохгүй
public class NotLeave extends Leave_Approval{
    @Override
    public void approveLeave(Student_Leave Leave) {
        System.out.println("8-59 хоногийн хооронд чөлөө болгох боломжгүй ");
    }
}
