package Lab11_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sudalgaa {
    Map<String,String> info = new HashMap<>();
    String value;

    String typeName = "";
    int type;
    String[] text;
    Scanner sc = new Scanner(System.in);
    public void Start(){
        System.out.println("-> Энэхүү судалгаа эхлүүллээ ☻");
        System.out.println("Ямар төрлийн судалгаа явагдаж байна вэ?1) сэтгэл ханамж 2) хичээлийн орчин 3) танхим ашиглалт");
        type = sc.nextInt();
        switch (type) {
            case 1: {
                typeName = "Сэтгэл Ханамжийн Судалгаа";
                text = new String[]{"Хичээл зааж буй багш шаардлага сайн тавьдаг уу", "Даалгавараа хир ойлгомжтой заадаг вэ"};
            }
            break;
            case 2: {
                typeName = "Хичээлийн орчинтой холбоотой судалгаа";
                text = new String[]{"Лабораторын анги хүртээмжтэй юу","Хичээлээ хийхэд орчин чухал уу"};

            }
            break;
            case 3: {
                typeName = "Танхимийн ашиглалттай холбоотой судалгаа";
                text = new String[]{"Хичээлийн бус цагаар хичээлээ хийх орчин бүрддэг үү", "Танд хичээлийн бус цагаар сул танхим олддог уу"};
            }
            break;
            default:
                break;
        }
    }
    public void Add(){
        System.out.println(typeName);
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]+": ");
            value = sc.next();
            info.put(text[i],value);
        }
        System.out.println("Судалгаа нэмэгдүүллээ.");
        for (Map.Entry<String, String> set : info.entrySet()) {
            System.out.println("** "+set.getKey()+" <=> "+set.getValue()+" **");
        }
    }
    public void Sub(){
        System.out.println("-> Судалгаа хасагдлаа cleared ▲▲");
        info.clear();
    }
    public void Stop(){
        System.out.println("-> Уг судалгааг зогсоолоо");
        System.exit(0);
    }
}