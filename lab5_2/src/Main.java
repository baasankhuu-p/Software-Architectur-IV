import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lessons lesson = new Lessons();
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Хичээлийн тоог оруулах: ");
        val = sc.nextInt();
        lesson.calculate(val);
    }
    static class Lessons extends CreditCalculate{
    }
}