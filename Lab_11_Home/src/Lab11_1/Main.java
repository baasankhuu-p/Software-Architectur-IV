package Lab11_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //code..
        while (1>0) {
            System.out.println("========== Эхлэх ==========");
            System.out.print("Чөлөө авах тоо: ");
            Scanner sc = new Scanner(System.in);
            int leave = sc.nextInt();

            Leave_Approval T = new Teacher();
            Leave_Approval M = new Department_Management();
            Leave_Approval Tr = new Department_Train();
            Leave_Approval No = new NotLeave();

            T.setNextLeaveApproval(M);
            M.setNextLeaveApproval(Tr);
            Tr.setNextLeaveApproval(No);

            T.approveLeave(new Student_Leave(leave));
            System.out.println("========== Дуусах ==========");
        }
    }
}
