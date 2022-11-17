package lab11_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dName, fName,lName,phone,date;
        System.out.print("Байгууллагын нэрээ оруулна уу? ");
        dName = sc.next();
        System.out.print("Овогоо оруулна уу? ");
        lName = sc.next();
        System.out.print("Нэрээ оруулна уу? ");
        fName = sc.next();
        System.out.print("Холбоо барих утсаа оруулна уу? ");
        phone = sc.next();
        System.out.print("Он-сар-өдөр ");
        date = sc.next();

        System.out.println("------------------------------------------------Хүсэлт------------------------------------------------");
        AlbanBichig huselt = new Huselt(dName,fName,lName,phone,date);
        huselt.doPrinting();
        System.out.println("------------------------------------------------Өргөдөл------------------------------------------------");
        AlbanBichig orgodol = new Orgodol(dName,fName,lName,phone,date);
        orgodol.doPrinting();

        System.out.println("------------------------------------------------Гомдол------------------------------------------------");
        AlbanBichig gomdol = new Gomdol(dName,fName,lName,phone,date);
        gomdol.doPrinting();
    }
}
