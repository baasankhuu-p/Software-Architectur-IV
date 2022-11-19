package lab11_5;

public class Gomdol extends AlbanBichig{
    String dName, fName,lName,phone,signature,date;

    public Gomdol(String dName, String fName, String lName, String phone, String date) {
        this.dName = dName;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.signature = lName+"-ын "+fName;
        this.date = date;
    }

    @Override
    public void start() {System.out.println(date+" ХХК-д" +
            "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tГомдол гаргах нь" +
            "\n\t"+lName+"-ын "+fName+" нь ************************************************************" +
            "\n****************************************************************************************" +
            "\n****************************************************************************************" +
            "\n****************************************************************************************" +
            "\n****************************************************************************************" +
            "\n****************************************************************************************" +
            "\n**************************************************************************************** шийдэж өгнө үү");
        System.out.println("Гомдол гаргасан: "+fName+"\nГарын үсэг/.."+signature+"../");
        System.out.println("Утас: "+phone);
        System.out.println("Гомдол гаргасан огноо: "+date);
    }
    @Override
    public void signature() {
        System.out.println("\n***Таны гарын үсэг бүртгэгдлээ*** "+signature);
    }

    @Override
    public void end() {
        System.out.println("***Таны гомдлыг илгээлээ***");
    }
}
