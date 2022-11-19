package Lab12_2;

public class Square implements IColor{
    Square(){
        System.out.println("Дөрвөлжин дүрс үүслээ");
    }
    @Override
    public void execute(Color color) {
        System.out.println("Дөрвөлжин дүрс талбай: "+color.area);
        System.out.println("Дөрвөлжин дүрсний өнгө: "+color.color);
    }
}
