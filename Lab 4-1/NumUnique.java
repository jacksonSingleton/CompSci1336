/**
 * NumUnique
 */
public class NumUnique {
    public static void main(String[] args) {
        System.out.println(numUnique(1,1,1));
    }
    public static int numUnique(int a, int b, int c) {
        int counter = 1;
        if (a!=b) {
            counter++;
        }
        if(a!=c&&b!=c){
            counter++;
        }
        return counter;
    }
}