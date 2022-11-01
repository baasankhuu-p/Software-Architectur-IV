import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Salary,type;
        Scanner sc = new Scanner(System.in);
        while(1==1) {
            System.out.println("===========Start===========");
            System.out.print("Salary: ");
            Salary = sc.nextInt();
            System.out.print("Choose 1) 2020 2) 2021 3) exit: ");
            type = sc.nextInt();
            switch (type){
                case 1: {
                    AbsTatvar Tatvar2020 = new Tatvar2020(Salary);
                    Tatvar2020.show();
                }break;
                case 2: {
                    AbsTatvar Tatvar2021 = new Tatvar2021(Salary);
                    Tatvar2021.show();
                }break;
                default: System.exit(0);
            }
        }
    }
}