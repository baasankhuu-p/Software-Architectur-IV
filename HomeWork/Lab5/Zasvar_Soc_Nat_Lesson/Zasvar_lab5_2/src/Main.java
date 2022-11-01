import java.util.Scanner;

import static java.util.Optional.empty;

public class Main {
    public static void main(String[] args) {
        ALesson natural,socail;
        Scanner sc = new Scanner(System.in);
        String name;
        long payment;
        float Credit;
        int Lesson_Count,lessonType = 0;
        System.out.println("=======================(Start)========================");
        System.out.print("Нийт үзэх хичээлийн тоо:\t");
        Lesson_Count = sc.nextInt();

        for (int i = 0;i < Lesson_Count;i++){
            System.out.println("=======================Start========================");
            System.out.print("Байгалийн Ухаан(1), Нийгмийн ухаан(2), гарах(3):\t");
            lessonType = sc.nextInt();
            switch (lessonType) {
                case 1: {
                    System.out.println("("+(i+1)+")-р хичээл");
                    System.out.print("Хичээлийн нэр:\t");
                    name = sc.next();
                    System.out.print("Кредит цаг:\t");
                    Credit = sc.nextFloat();

                    natural = new Natural(name, Credit, (long) (108000 * Credit));
                    System.out.println("=======================Info========================");
                    natural.getName();
                    natural.getPayment();
                    natural.getCredit();
                    break;
                }
                case 2: {
                    System.out.println("("+(i+1)+")-р хичээл");
                    System.out.print("Хичээлийн нэр:\t");
                    name = sc.next();
                    System.out.print("Кредит цаг:\t");
                    Credit = sc.nextFloat();

                    socail = new Social(name, Credit, (long) (105000 * Credit));
                    System.out.println("=======================Info========================");
                    socail.getName();
                    socail.getPayment();
                    socail.getCredit();
                    break;
                }
                case 3: {
                    System.exit(0);
                    break;
                }
            }
            System.out.println("=======================End========================");
        }

        System.out.println("=======================(End)========================");
    }
}