import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        System.out.println("ENTER [add] TO ADD A WORD, [end] TO FINISH");
        while(true) {
            String command = scanner.nextLine();
            if (command.equals("add")) {

            }
            else if (command.equals("end")) {
                System.out.println("bye bye");
                break;
            }
            else {
                System.out.println("command not recognized");
                continue;
            }
        }
    }
}
