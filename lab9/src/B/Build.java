package B;

import java.util.Scanner;

public class Build {
    Build(){
        int bool = 1;
        Scanner sc = new Scanner(System.in);
        BookShop Shop = new BookShop();
        while(bool == 1){
            System.out.print("******************Хэрэглэгч үүсгэх үү!******************\n1. Тийм Бусад. Болих!\n");
            bool = sc.nextInt();

            new User();
        }
    }
}
