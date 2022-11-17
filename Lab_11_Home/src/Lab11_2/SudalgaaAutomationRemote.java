package Lab11_2;

public class SudalgaaAutomationRemote {
        ICommandSudalgaa command;
        public void setCommand(ICommandSudalgaa command) {
            this.command=command;
        }
        public void buttonPressed() {
            command.execute();
        }
    }
