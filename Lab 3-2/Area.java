/**
 * Area
 */
public class Area {
    public static void main(String[] args){
        //Replace the argument of the function to change the radius
        area(2.0);   
    }
    public static double area(double radius){
            double areaCalc = Math.PI*Math.pow(radius,2);
            return areaCalc;
        }
}