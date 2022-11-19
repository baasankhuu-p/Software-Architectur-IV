package Lab12_2;

import java.util.Random;

/*Flyweight Design Pattern*/
public class Main {
    public static void main(String[] args) {

        String[] durs = {"round","square","triangle"};
        String[] color = {"red","blue","blur","red","white","green","black"};
        for (int i = 0;i<100;i++){
            int dursrnd = new Random().nextInt(durs.length);
            int colorrnd = new Random().nextInt(color.length);

            Color colors = new Color();
            colors.setColor(color[colorrnd]);
            colors.setArea(new Random().nextInt(100));
            IColor iColor = ColorFactory.getColorInstance(durs[dursrnd]);
            iColor.execute(colors);
            System.out.println("*************************");
        }
    }
}
