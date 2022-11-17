package Lab11_2;

import java.util.Scanner;

public class StartSudalgaaCommand implements ICommandSudalgaa{
    Sudalgaa sudalgaa;
    String Name;
    Scanner sc = new Scanner(System.in);
    StartSudalgaaCommand(Sudalgaa sudalgaa){
        this.sudalgaa = sudalgaa;
    }
    @Override
    public void execute() {
        sudalgaa.Start();
    }
}
