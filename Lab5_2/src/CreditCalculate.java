import java.util.Scanner;

public abstract class CreditCalculate {
    void calculate(int countLesson){
        Scanner sc = new Scanner(System.in);
        NaturalScience nat = new NaturalScience();
        SocialScience soc = new SocialScience();
        String name="";
        int pay;
        int credit;
        for (int i = 0; i < countLesson; i++) {
            int type;
            System.out.print("1)Байгалийн ШУ \t2)Нийгмийн ШУ \t3)Exit: ");
            type = sc.nextInt();
            switch (type){
                case 1: {

                    System.out.print("\tХичээлээ оруулна уу: ");
                    name = sc.next();
                    soc.setName(name);
                    System.out.print("\tКребит цагаа оруулна уу: ");
                    credit = sc.nextInt();
                    soc.setCredit(credit);
                    soc.setPay(108000*credit);
                }
                break;
                case 2: {

                    System.out.print("\tХичээлээ оруулна уу: ");
                    name = sc.next();
                    nat.setName(name);
                    System.out.print("\tКребит цагаа оруулна уу: ");
                    credit = sc.nextInt();
                    nat.setCredit(credit);
                    nat.setPay(105000*credit);
                }
                break;
                case 3: {
                    System.out.println("Exit ...");
                    System.exit(0);
                }break;
            }
        }
        System.out.println("\n*********************** Output ***********************");
        System.out.println("Нэгж хичээлийн төлбөр: Байгалийн ШУ (108000)\tНийгмийн ШУ (105000)");
        System.out.println("-> Байгалийн ШУ:\n\tХичээлийн Нэрс: [ "+soc.getName()+"]\n\tҮзсэн Кредит: ["+soc.getCredit()+"кр]\n\t"+"Төлбөр: ["+soc.getPay()+".00₮]");
        System.out.println("-> Нийгмийн ШУ:\n\tХичээлийн Нэрс: [ "+nat.getName()+"]\n\tҮзсэн Кредит: ["+nat.getCredit()+"кр]\n\t"+"Төлбөр: ["+nat.getPay()+".00₮]");
        System.out.println("-> Нийт үзсэн Хичээл: [ " + soc.getName()+nat.getName()+"]");
        System.out.println("-> Нийт үзсэн Кредит: " + "["+(soc.getCredit()+nat.getCredit())+"кр]");
        System.out.println("-> Нийт Төлбөр: " + "["+(soc.getPay()+nat.getPay())+"₮]");
    };
}