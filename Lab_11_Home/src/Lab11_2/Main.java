package Lab11_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sudalgaa sudalgaa = new Sudalgaa();
        SudalgaaAutomationRemote autoRemote = new SudalgaaAutomationRemote();

        Scanner sc = new Scanner(System.in);
        autoRemote.setCommand(new StartSudalgaaCommand(sudalgaa));
        autoRemote.buttonPressed();

        autoRemote.setCommand(new IncrementSudalgaaCommand(sudalgaa));
        autoRemote.buttonPressed();

        autoRemote.setCommand(new SubtractSudalgaaCommand(sudalgaa));
        autoRemote.buttonPressed();

        autoRemote.setCommand(new StopSudalgaaCommand(sudalgaa));
        autoRemote.buttonPressed();
    }
}