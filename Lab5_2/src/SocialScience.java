public class SocialScience {
    String name = "";
    int credit=0;
    int pay=0;

    public void setName(String name) {
        this.name +=name+" ";
    }

    public void setCredit(int credit) {
        this.credit += credit;
    }

    public void setPay(int pay) {
        this.pay += pay;
    }

    public String getName() {
        return name;
    }
    public float getCredit() {
        return credit;
    }

    public int getPay() {
        return pay;
    }
}
