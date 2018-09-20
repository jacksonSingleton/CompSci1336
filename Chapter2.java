import java.util.Scanner;

public class Chapter2{
    public static void main(String[] args){    
        int sum = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type something in: ");
        String userString = userInput.nextLine();


        for (int i = 0; i < userString.length(); i++){
            System.out.println(userString.charAt(i));
            int charNum = userString.charAt(i);
            System.out.println(charNum);
            sum += charNum;
        }

        System.out.println("\nYou typed in: " + userString);
        System.out.println("The sum of the characters' ASCII code is: " + sum);

    }
}

