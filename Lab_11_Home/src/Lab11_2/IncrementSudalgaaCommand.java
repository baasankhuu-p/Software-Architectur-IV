package Lab11_2;

public class IncrementSudalgaaCommand implements ICommandSudalgaa{
    Sudalgaa sudalgaa;
    IncrementSudalgaaCommand(Sudalgaa sudalgaa){
        this.sudalgaa = sudalgaa;
    }
    @Override
    public void execute() {
        sudalgaa.Add();
    }
}
