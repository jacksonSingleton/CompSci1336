/**
 * ProcessName2
 */
public class ProcessName2 {

    public static void main(String[] args) {
        
    }
    public static void processName(Scanner input) {
        System.out.print("Type Your Name: ");
        String name = "";
        boolean correctFmat = false;
        String errLine = "Error, must be at least 5 chars with a space.";
        while(!correctFmat){
            System.out.print("Type your name: ");
            name = console.nextLine();
            if(name.length() < 5){
                System.out.println(errLine);
            }else if(!name.contains(" ")){
                System.out.println(errLine);
            }else{
                correctFmat = true;
            }
        }
        int spaceIndex = name.indexOf(' ');
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex+1, name.length());
        name = lastName + ", " + firstName.substring(0,1) + ".";
        System.out.println("Your name is: " + name);
    }
}