/**
 * Midpoint
 */
public class Midpoint {

    public static void main(String[] args) {
        System.out.println(hasMidpoint(6,9,8));
    }
    public static boolean hasMidpoint(int a, int b, int c) {
        int small = 0;
        int large = 0;

        if(a > b && a > c){
            large = a;
            if (b > c) {
                small = c;
            } else {
                small = b;
            }
        }
        else if(b > a && b > c){
            large = b;
            if (a > c) {
                small = c;
            } else {
                small = a;
            }
        }
        else{
            large = c;
            if (a > b) {
                small = b;
            } else {
                small = a;
            }
        }
        double midpoint = large - ((large-small)/2.0);
        if (a == midpoint || b == midpoint || c == midpoint) {
            return true;
        }
        else{
            return false;
        }
    }
}