/**
 * Pow
 */
public class Pow {

    public static void main(String[] args) {
        System.out.println(pow(3,4));
    }
    public static int pow(int base, int exponent) {
        int baseMut = base;
        if (exponent == 0) {
            return 1;
        }
        else{
            for (int i = 1; i < exponent; i++) {
                baseMut *= base;
                System.out.println(i + ": " + baseMut);
            }
            return baseMut;
        }
    }
}