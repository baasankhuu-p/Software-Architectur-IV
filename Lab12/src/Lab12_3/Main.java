package Lab12_3;

/*Composite design pattern*/
public class Main {
    public static void main(String[] args) {
        IFamily rt_family = new Family("Буудай","Жарантай");
        IFamily grandf = new GrandFather("Жарантай","Тавьтай");
        IFamily father = new Father("Тавьтай","Пүрэв");
        IFamily me = new Me("Пүрэв","Баасанхүү");
        rt_family.add(grandf);
        rt_family.add(father);
        rt_family.add(me);
        rt_family.print();
    }
}
