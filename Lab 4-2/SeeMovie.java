/**
 * SeeMovie
 */
public class SeeMovie {

 public static void main(String[] args) {
     seeMovie(2,5);
 }   
 public static void seeMovie(double cost, int rating) {
     String no = "not interested";
     String maybe = "sort-of interested";
     String  yes = "very interested";
     if (cost < 5) {
         System.out.println(yes);
     }
     else if(cost>= 12 && rating == 5){
         System.out.println(maybe);
     }
     else if(cost < 12 && rating == 5){
         System.out.println(yes);
     }
     else if(rating <=4 && rating >= 2 && cost < 12 && cost >=5){
         System.out.println(maybe);
     }
     else{
         System.out.println(no);
     }

 }
}
