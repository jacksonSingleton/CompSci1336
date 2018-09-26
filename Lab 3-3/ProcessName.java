import java.util.Scanner;

/**
 * ProcessName
 */
public class ProcessName {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        processName(console);

    }
    public static void processName(Scanner input) {
        System.out.print("Please enter your full name: ");
        String name = input.nextLine();
        int space = name.indexOf(' ');
        String firstName = name.substring(0, space);
        String lastName = name.substring(space+1, name.length());
        System.out.println("Your name in reverse order is " + lastName + ", "+ firstName);
    }
}