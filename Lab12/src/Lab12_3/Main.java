package Lab12_3;

/*Composite design pattern*/
public class Main {
    public static void main(String[] args) {
        IFamily family = new Family("Буудай","Жарантай");
        IFamily grandf = new GrandFather("Жарантай","Тавьтай");
        IFamily father = new Father("Тавьтай","Пүрэв");
        IFamily me = new Me("Пүрэв","Баасанхүү");
        family.add(grandf);
        family.add(father);
        family.add(me);
        family.print();
    }
}
