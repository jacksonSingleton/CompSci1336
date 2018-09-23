
public class RocketShip {
    public static final int HEIGHT = 2;
    public static void main(String[] args) {
        cone();
        line();
        tankTop();
        tankBottom();
        line();
        tankBottom();
        tankTop();
        line();
        cone();

    }
    public static void cone() {
        for (int line = 1; line < (HEIGHT*2); line++) {
            for (int spaces = 1; spaces <= -1*line+(HEIGHT*2); spaces++) {
                System.out.print(" ");
            }
            for (int slashesL = 1; slashesL <= line; slashesL++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int slashesR = 1; slashesR <= line; slashesR++) {
                System.out.print("\\");
            }
            for (int spaces = 1; spaces <= -1*line+(HEIGHT*2); spaces++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        
            
    }
    public static void line() {
        System.out.print("+");
        for (int border = 1; border <= HEIGHT*2; border++) {
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();
    }
    public static void tankTop() {
        for (int line = 1; line <= HEIGHT; line++) {
            System.out.print("|");
            for (int dots = 1; dots <= HEIGHT-line; dots++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= line; slash++) {
                System.out.print("/\\");
            }
            for (int dots = 1; dots <= (HEIGHT*2)-(line*2); dots++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= line; slash++) {
                System.out.print("/\\");
            }
            for (int dots = 1; dots <= HEIGHT-line; dots++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void tankBottom() {
        for (int line = 1; line <= HEIGHT; line++) {
            System.out.print("|");
            for (int dots = 1; dots <= line-1; dots++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= HEIGHT-(line-1); slash++) {
                System.out.print("\\/");
            }
            for (int dots = 1; dots <= (2*line)-2; dots++) {
                System.out.print(".");
            }
            for (int slash = 1; slash <= HEIGHT-(line-1); slash++) {
                System.out.print("\\/");
            }
            for (int dots = 1; dots <= line-1; dots++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}