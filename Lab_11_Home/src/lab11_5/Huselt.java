package lab11_5;

public class Huselt extends AlbanBichig{
    String dName, fName,lName,phone,signature,date;

    public Huselt(String dName, String fName, String lName, String phone, String date) {
        this.dName = dName;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.signature = lName+"-ын "+fName;
        this.date = date;
    }

    @Override
    public void start() {
        System.out.println("\n\t\t\t\t\t\t"+dName+"  ҮНЭЛГЭЭНИЙ ХҮСЭЛТ ГАРГАХ МАЯГТ");
        System.out.println("Сургалтын үйл ажиллагааны журмаас...\n" +
                "4.5.30.      Суралцагч хичээлийг судалж, амжилттай үнэлгээ авсан ч тухайн хичээлээр эзэмшсэн мэдлэг, ур чадвар, хандлагын үнэлгээгээ \n" +
                "ахиулах зорилгоор “R” үнэлгээ тавиулан дахин судалж болно. Суралцах хугацаанд дахин судлах хичээлийн тоо 3 хүртэл байна. Хос хөтөлбөрөөр \n" +
                "суралцагч нь хөтөлбөр тус бүрээр 3 хүртэл хичээл дахин судалж болно.\n" +
                "4.5.31.      Суралцагч судалж, дүгнэгдсэн хичээлийг дахин судлах тохиолдолд, Сургалтын үйл ажиллагаа хариуцсан нэгжид хүсэлт гаргаж, \n" +
                "сургалтын мэдээллийн системд өмнөх үнэлгээг “R” болгож тэмдэглүүлнэ. “R” үнэлгээ тавиулсан тохиолдолд өмнөх дүн хүчингүй болох бөгөөд \n" +
                "буцаах боломжгүй. “R” үнэлгээтэй суралцагч тухайн хичээлийн залгамж холбоотой хичээлийг сонгон судалж болно.\n" +
                "4.5.32.       Суралцагчийн дахин судалсан хичээлийн сүүлчийн үнэлгээ нь албан ёсны дүнд тооцогдож дипломын хавсралтад бичигдэнэ\n");
        System.out.println("Суралцагчийн хүсэлт гаргасан огноо:   "+date);
        System.out.println("Суралцагчийн овог: "+fName);
        System.out.println("Суралцагчийн нэр: "+lName);
        System.out.println("Суралцагчийн утас: "+phone);
        System.out.println("Суралцагчийн гарын үсэг: / .."+signature+".. /");
    }

    @Override
    public void signature() {
        System.out.println("\n***Таны гарын үсэг бүртгэгдлээ***");
    }

    @Override
    public void end() {
        System.out.println("***Таны хүсэлтийг илгээлээ***");
    }
}
