/**
 * Pay
 */
public class Pay {

    public static void main(String[] args) {
        System.out.println(pay(4.00,11));
    }
    public static double pay(double salary, int hours) {
        double payroll = salary * hours;
        
        if (hours <= 8) {            
            return payroll;
        }
        else{
            int overtimeHours = hours - 8;
            double overtimePay = (salary*1.5)*overtimeHours;
            double regularPay = (hours-overtimeHours)*salary;
            payroll = overtimePay + regularPay;
            return payroll;            
        }
    }
}