/**
 * Week5
 */
public class Week5 {

    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        System.out.print(toDays(millis));
    }
    public static double toDays(long millisecs) {
        double days = (double)millisecs/1000/60/60/24;
        return days;
    }
}