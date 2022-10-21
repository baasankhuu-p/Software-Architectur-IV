import java.util.Stack;

public class Shop implements IShop{
    String name,date,Type;
    int dateLast;
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    int price,procentPrice;
    Stack<String> Shopstack = new Stack<>();

    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Stack AddItem() {
        String[] dateArr = this.date.split("-");//2022-10
        int year,month;
        year = Integer.parseInt(dateArr[0]);
        month = Integer.parseInt(dateArr[1]);
        dateLast = 2022-year;
        if(dateLast<0 || (dateLast==0 && month>10) || (year<1600 || month>12)){
            System.out.println("Хугацаа буруу орж ирлээ. Системээс гарлаа");
            System.exit(0);
            return Shopstack;
        }
        if(dateLast==0){
            Shopstack.push("Барааны нэр: "+getName()+"\tБарааны загвар: "+getType()+"\tБарааны үндсэн үнэ: "+getPrice()+"\tБарааны хугацаа: "+getDate()+"\n");
        }
        else {
            procentPrice = getPrice()-getPrice()*dateLast/10;
            Shopstack.push("Барааны нэр: "+getName()+"\tБарааны загвар: "+getType()+"\tБарааны үндсэн үнэ: "+getPrice()+"\tБарааны хямбралтай үнэ: "+procentPrice+"\tБарааны хугацаа: "+getDate()+"\n");
        }
        return Shopstack;
    }
    public void showList() {
        System.out.println("================Info================");
        System.out.println(Shopstack.toString().replaceAll(", ",""));
    }
}
