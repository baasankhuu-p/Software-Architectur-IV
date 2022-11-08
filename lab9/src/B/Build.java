package B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Build {
    Scanner sc = new Scanner(System.in);
    BookShop Shop =  new BookShop();
    Map<String,Integer> UserInfo = new HashMap<>();
    Build(){
        int bool = 1;
        Shop.dataBook();
        while(bool == 1){
            System.out.print("******************Хэрэглэгч үүсгэх үү!******************\n" +
                    "1. Тийм Бусад. Болих!\n");
            bool = sc.nextInt();
            UserBuild();
        }
    }
    public User UserBuild(){
        String name,address;
        int phone;

        System.out.println("Та нэрээ оруулна уу");
        name = sc.next();

        System.out.println("Та хаягаа оруулна уу");
        address = sc.next();

        System.out.println("Та дугаараа оруулна уу");
        phone = sc.nextInt();

        User user = new User(name, address, phone);
        user.Asuulga();
        return user;
    }
}
