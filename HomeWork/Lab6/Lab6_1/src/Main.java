import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String lName, ldate;
        int l_price,count;
        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);
        System.out.print("Нийт барааны тоо: ");
        count = sc.nextInt();
        for (int i = 0;i<count;i++){

            System.out.print("==== "+(i+1)+"-р Бараа ====\n" +
                    "Барааны нэр: ");
            shop.setName(sc.next());
            System.out.print("Барааны загвар: ");
            shop.setType(sc.next());
            System.out.print("Барааны үнэ: ");
            shop.setPrice(sc.nextInt());
            System.out.print("Оруулж ирсэн /*Ex: 2020-10*/: ");
            shop.setDate(sc.next());
            shop.AddItem();
        }
        shop.showList();
    }
}