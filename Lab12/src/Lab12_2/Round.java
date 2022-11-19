package Lab12_2;

public class Round implements IColor{
    Round(){
        System.out.println("Тойрог дүрс үүслээ");
    }
    @Override
    public void execute(Color color) {
        System.out.println("Тойрог дүрсний талбай: "+color.area);
        System.out.println("Тойрог дүрсний өнгө: "+color.color);
    }
}
