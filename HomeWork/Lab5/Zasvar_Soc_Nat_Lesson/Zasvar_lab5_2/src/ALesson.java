public abstract class ALesson {
    /**
     * Name, Credit, Payment
     * */
    String Name="";
    float Credit = 0;
    long Payment = 0;

    ALesson(String name, float credit,long payment){
        this.Name = name;
        this.Credit = credit;
        this.Payment = payment;
    }

    public void setCredit(float credit) {
        Credit = credit;
    }

    public void setPayment(long payment) {
        Payment = payment;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getCredit() {
        System.out.println("Үзэх кредит цаг:\t"+Credit);
        return Credit;
    }

    public long getPayment() {
        System.out.println("Үзэх хичээлийн төлбөр:\t"+Payment);
        return Payment;
    }

    public String getName() {
        System.out.println("Үзэх кредит нэр:\t"+Name);
        return Name;
    }
}
