package Lab12_3;

public class GrandFather implements IFamily{
    private String getName;
    private String getLastName;

    public GrandFather(String getLastName,String getName) {
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
        System.out.println("============= Элэнц Өвөө = Өвөө =============");
        System.out.println("Овог = "+getLastName());
        System.out.println("Нэр = "+getName());
        System.out.println("==========================");
    }

    @Override
    public void add(IFamily family) {

    }
}
