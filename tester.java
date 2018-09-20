public class Tester{
    public static void main(String[] args){
        printGrid(4, 6);
    }
    public static void printGrid(int a, int b){
        for (int i = 1; i <= a+1; i++) {   
            for (int j = 1; j <= b;j++) {
               System.out.print(i+(j*a)-a);
               for (int k = 0; k < 1; k++) {
                System.out.print(", ");
               }
            }
            
            
            System.out.println();
        }
        
    }
}