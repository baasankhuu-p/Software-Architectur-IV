import java.util.Scanner;
public class Bodlogo1_Finance {
    static void Builder(){
        float P,N;
        float R;
        long M;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Гараас зээлээр авах мөнгөн дүнг асуух?");
        P = myObj.nextFloat();

        System.out.println("Жилийн хүүг асуух ?");
        R = myObj.nextFloat()/100;

        System.out.println("Зээлийн хугацаа жилээр ?");
        N = myObj.nextFloat()*12;

        System.out.println("Нийт төлөх зээлийн хэмжээ? ");
        M = (long) (P*((R*Math.pow((1+R),N))/(Math.pow((1+R),N)-1)));

        System.out.println(M+(long)P);
    }
    public static void main(String[] args){
        Builder();
    }
}
