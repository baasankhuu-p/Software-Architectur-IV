package Lab11_2;

public class SubtractSudalgaaCommand implements ICommandSudalgaa{

    Sudalgaa sudalgaa;
    SubtractSudalgaaCommand(Sudalgaa sudalgaa){
        this.sudalgaa = sudalgaa;
    }
    @Override
    public void execute() {
        sudalgaa.Sub();
    }
}