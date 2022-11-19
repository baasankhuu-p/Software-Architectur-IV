package Lab12_2;

public class Triangle implements IColor{
    Triangle(){
        System.out.println("Гурвалжин дүрс үүслээ");
    }
    @Override
    public void execute(Color color) {
        System.out.println("Гурвалжин дүрс талбай: "+color.area);
        System.out.println("Гурвалжин дүрсний өнгө: "+color.color);
    }
}
