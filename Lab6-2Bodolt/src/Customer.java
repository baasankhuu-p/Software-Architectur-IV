import java.util.Stack;

public class Customer {
    String imageName="",name="";

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName += imageName+" ";
    }

    public String  getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
