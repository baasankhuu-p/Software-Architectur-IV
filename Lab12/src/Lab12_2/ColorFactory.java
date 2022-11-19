package Lab12_2;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {
    ColorFactory(String type){
        throw new AssertionError("Cannot instantiate the class");
    }
    static Map<String,IColor> map = new HashMap<>();
    public static synchronized IColor getColorInstance(String type){
        IColor color = map.get(type);
        if(color==null) {
            switch (type) {
                case "round":
                    color = new Round();
                    break;
                case "square":
                    color = new Square();
                    break;
                case "triangle":
                    color = new Triangle();
                    break;
            }
            map.put(type, color);
        }
        return color;
    }
}

