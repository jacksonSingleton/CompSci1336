/**
 * DigitSum
 * Jackson Singleton
 */
public class DigitSum {

    public static void main(String[] args) {
        digitSum(29107);
    }
    public static int digitSum(int toSum) {
        int sum = 0;
        toSum = Math.abs(toSum);
        while(toSum > 0){
            int lastDigit = toSum % 10;
            sum += lastDigit;
            toSum /= 10;
        }
        return sum;
    }
}