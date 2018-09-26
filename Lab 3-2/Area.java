/**
 * Area
 */
public class Area {
    public static void main(String[] args){
        //Replace the argument of the function to change the radius
        area(2.0);   
    }
    //Method is a double instead of void so it can return a double
    //i.e if you want to return an int use:
    //public static int methodName(arguments){}
    public static double area(double radius){
            double areaCalc = Math.PI*Math.pow(radius,2);
            return areaCalc;
        }
}