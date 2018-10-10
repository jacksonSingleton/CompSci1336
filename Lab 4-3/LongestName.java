import java.util.*;
public class LongestName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        longestName(console, 3);
    }
    public static void longestName(Scanner input, int names) {
        int prevLen = 0;
        String record = "";
        boolean tie = false;
        if (names > 0) {
            for (int i = 1; i <= names; i++) {
                System.out.print("name #" + i + "? ");
                String currentInput = input.nextLine();
                if(currentInput.length() == prevLen){
                    tie = true;
                }
                if(currentInput.length() > prevLen){
                    prevLen = currentInput.length();
                    record = currentInput;
                    record = record.substring(0,1).toUpperCase() + record.substring(1).toLowerCase();
                    tie = false;
                }     
                else{
                    tie = tie;
                }         
            }            
            if(tie){
                System.out.println(record + "'s name is longest");
                System.out.println("(There was a tie!)");
            }
            else{
                System.out.println(record + "'s name is longest");
            }
        }
    }
}