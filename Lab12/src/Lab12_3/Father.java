package Lab12_3;

public class Father implements IFamily{
    private String getName;
    private String getLastName;

    public Father(String getLastName,String getName) {
        this.getName = getName;
        this.getLastName = getLastName;
    }

    @Override
    public String getLastName() {
        return getLastName;
    }

    @Override
    public String getName() {
        return getName;
    }

    @Override
    public void print() {
        System.out.println("============= Өвөө = Аав =============");
        System.out.println("Овог = "+getLastName());
        System.out.println("Нэр = "+getName());
        System.out.println("==========================");
    }

    @Override
    public void add(IFamily family) {

    }
}
