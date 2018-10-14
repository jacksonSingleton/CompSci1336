
import java.util.*;
public class Admission {   
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        application(console);
    }
    public static void application(Scanner input) {
        double firstApp = 0.0;
        double secondApp = 0.0;
        double testScore = 0.0;
        double gradeScore = 0.0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Information for applicant #" + (i+1));
            System.out.println("Do you have 1) SAT scores or 2) ACT scores?");
            int testChoice = input.nextInt();
            if (testChoice == 1) {
                testScore = satApplication(input);
                gradeScore = generalApplication(input);
            }
            else{
                testScore = actApplication(input);
                gradeScore = generalApplication(input);
            }
            if(i == 0){
                firstApp = testScore + gradeScore;
            }
            else{
                secondApp = testScore + gradeScore;
            }
        }
        System.out.printf("First applicant overrall score = " + "%.1f",firstApp);
        System.out.println();
        System.out.printf("Second applicant overrall score = " + "%.1f",secondApp);
        System.out.println();
        if (firstApp > secondApp) {
            System.out.println("The first applicant seems to be better");
        }
        else if(secondApp > firstApp){
            System.out.println("The second applicant seems to be better");
        } 
        else {
            System.out.println("The two applicants seem to be equal");
        }
    }
    public static double satApplication(Scanner scores) {
        System.out.println("SAT math?");
        int math = scores.nextInt();
        System.out.println("SAT critical reading?");
        int critReading = scores.nextInt();
        System.out.println("SAT writing?");
        int writing = scores.nextInt();
        double examScore = ((2*math)+critReading+writing)/32;
        System.out.printf("Exam Score: " + "%.1f", examScore);
        System.out.println();
        return examScore;
    }
    public static double actApplication(Scanner scores) {
        System.out.println("ACT english?");
        int english = scores.nextInt();

        System.out.println("ACT math?");
        int math = scores.nextInt();

        System.out.println("ACT reading?");
        int reading = scores.nextInt();

        System.out.println("ACT science?");
        int science = scores.nextInt();
        
        double examScore = (english+(2*math)+reading+science)/1.8;
        System.out.printf("Exam Score: " + "%.1f", examScore);
        System.out.println();
        return examScore;
    }
    public static double generalApplication(Scanner userInput) {
        System.out.println("Overall GPA?");
        double gpa = userInput.nextDouble();
        System.out.println("Max GPA?");
        double maxGPA = userInput.nextDouble();
        System.out.println("Transcript multiplier?");
        double transMult = userInput.nextDouble();
        double gpaScore = (gpa/maxGPA)*100*transMult;
        System.out.printf("GPA Score: " + "%.1f", gpaScore);
        System.out.println();
        return gpaScore;
    }
}