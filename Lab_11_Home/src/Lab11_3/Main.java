package Lab11_3;
import java.util.List;
import java.util.Scanner;
/*
* Оюутнууд хичээл сонголт хийдэг.bachelor, master, phd оюутнууд өөр өөр  Тухайн хичээл сонголтын бүх
* төлвүүдийг харах боломжтой байх засварлагч програм хий.Хичээл сонголт нь хичээлийн нэр болон хичээлийн
* кодын мэдээллийг харуулна. 500 кодтой бакалавр, 600 кодтой бол магистр, 700 кодтой бол доктор оюутнуудыг хичээл.
Сонголт – Refrigerator
Бак, маг, док нь LivingAreaOriginator
CareTakerStore-нь сонгосон төлвүүдийг хадгална.
Memonto –нь хичээл сонголтын төлөв.
* */
public class Main {
    public static void main(String[] args) {
        ListStudent students = new ListStudent();
        while (1>0){
            int type;
            Scanner sc = new Scanner(System.in);
            System.out.print("Кодоо оруулна уу");
            type = sc.nextInt();
            switch (type){
                case 500:
                    break;
                case 600:
                    break;
                case 700:
                    break;
                default:break;
            }
        }
    }
}
