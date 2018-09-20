
public class Mirror{
    public static final int SIZE = 8;
    public static void main(String[] args){
        drawLine();
        drawHalf1();
        drawHalf2();
        drawLine();
    }
    //Define the methods for drawing the shape

    public static void drawLine(){
        System.out.print("#");
        for (int i = 1; i <= (4 * SIZE); i++) {
            System.out.print("=");
        }
        System.out.print("#");
        System.out.println();
    }
    public static void drawHalf1(){
        for (int line = 1; line <= SIZE; line++) {
           System.out.print("|"); 
           //Print Spaces
           for (int spaces = 1; spaces <= (-2 * line + (SIZE*2)); spaces++) {
               System.out.print(' ');
           }
           System.out.print("<>");
           //Print Dots
           for (int dots = 1; dots <= (4 * line - 4); dots++) {
               System.out.print('.');
           }
           System.out.print("<>");
           for (int spaces2 = 1; spaces2 <= (-2 * line + (SIZE*2)); spaces2++) {
            System.out.print(' ');
        }
        System.out.print("|");
        System.out.println();
        }
    }
    public static void drawHalf2(){
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|"); 
            //Print Spaces
            for (int spaces = 1; spaces <= (-2 * line + (SIZE*2)); spaces++) {
                System.out.print(' ');
            }
            System.out.print("<>");
            //Print Dots
            for (int dots = 1; dots <= (4 * line - 4); dots++) {
                System.out.print('.');
            }
            System.out.print("<>");
            for (int spaces2 = 1; spaces2 <= (-2 * line + (SIZE*2)); spaces2++) {
             System.out.print(' ');
         }
         System.out.print("|");
         System.out.println();
         }
    }
}