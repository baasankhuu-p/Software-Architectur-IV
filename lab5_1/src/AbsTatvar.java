import java.util.Scanner;

public abstract class AbsTatvar{
    /**НДШ => NDSH = 11%,
     * Татвар ногдуулах орлого => TNO,
     * Ногдуулсан албан татвар => NAT,
     * Чөлөөлөгдөх татвар =>CHT,
     * Төлбөл зохих татвар =>TZT,
     * Гарт авах цалин=>GATS* */
    long Salary,GATS;
    float NDSH,TNO, NAT, CHT,TZT;
    AbsTatvar(int salary,float ndsh,float nat,float cht){
        this.Salary = salary;
        this.NDSH = salary*(ndsh);//0.11
        this.TNO = salary - NDSH;
        this.NAT = TNO*(nat);//0.1
        this.CHT = cht;//0.1
        this.TZT = NAT-CHT;//0.9
        this.GATS = (long) (TNO - NAT+CHT);
    }
    public void show() {
        System.out.println("Оруулсан цалин: "+Salary);
        System.out.println("НДШ: "+NDSH);
        System.out.println("Татвар ногдуулах орлого: "+TNO);
        System.out.println("Ногдуулсан албан татвар: "+NAT);
        System.out.println("Чөлөөлөгдөх татвар: "+CHT);
        System.out.println("Төлбөл зохих татвар: "+TZT);
        System.out.println("Гарт авах цалин: "+GATS);
        System.out.println("===========End===========");
    }

}
