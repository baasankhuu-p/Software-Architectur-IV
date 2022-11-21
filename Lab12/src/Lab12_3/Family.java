package Lab12_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Family implements IFamily{
    private String getName;
    private String getLastName;
    List<IFamily> families = new ArrayList<IFamily>();

    public Family(String getLastName,String getName) {
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
        System.out.println("============= Өвөг =============");
        System.out.println("Овог = "+getLastName());
        System.out.println("Нэр = "+getName());
        System.out.println("==========================");

        Iterator<IFamily> it = families.iterator();

        while(it.hasNext())  {
            IFamily family = it.next();
            family.print();
        }
    }
    @Override
    public void add(IFamily family) {
        families.add(family);
    }

}
