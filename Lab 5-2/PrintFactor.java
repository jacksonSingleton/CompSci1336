/**
 * PrintFactor
 */
public class PrintFactor {

    public static void main(String[] args) {
        printFactors(24);
    }
    public static void printFactors(int max) {
        for(int i = 1; i < max; i++){
            if(max % i == 0){
                System.out.print(i + " and ");
            }
        }
        System.out.print(max);
        System.out.println();
    }
}