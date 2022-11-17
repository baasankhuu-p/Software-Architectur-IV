package Lab11_2;

public class StopSudalgaaCommand implements ICommandSudalgaa{
    Sudalgaa sudalgaa;
    StopSudalgaaCommand(Sudalgaa sudalgaa){
        this.sudalgaa = sudalgaa;
    }
    @Override
    public void execute() {
        sudalgaa.Stop();
    }
}
