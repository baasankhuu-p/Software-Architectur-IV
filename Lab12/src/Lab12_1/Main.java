package Lab12_1;

import java.text.DecimalFormat;

/*Decorater design pattern*/
public class Main {
    public static void main(String[] args) {
        System.out.println("****************Обьект 1****************");
        ITohijilt tohijilt = new Gazar();
        tohijilt = new Suudrevch(tohijilt);
        tohijilt = new Hudag(tohijilt);;
        tohijilt = new Mod(tohijilt);
        System.out.println("Тохижилт: \n\t"+tohijilt.getTohjilt());
        System.out.println("Төсөв: "+tohijilt.getPayment());

        System.out.println("****************Обьект 2****************");
        ITohijilt tohijilt1 = new Ger();
        tohijilt1 = new NogooTarih(tohijilt1);
        tohijilt1 = new Suudrevch(tohijilt1);
        tohijilt1 = new Hudag(tohijilt1);;
        System.out.println("Тохижилт: \n\t"+tohijilt1.getTohjilt());
        System.out.println("Төсөв: "+tohijilt1.getPayment());
    }
}
