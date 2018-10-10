/**
 * Repitition
 */
public class Repitition {

    public static void main(String[] args) {
        System.out.println(repl("Howdy!", 6));
    }
    public static String repl(String message, int messageNum) {
        String userMsg = message;
        if (messageNum > 0) {
            for (int i = 1; i < messageNum; i++) {
                userMsg += message;
            }
            return userMsg;
        }
        else{
            return "";
        }
        
    }
}