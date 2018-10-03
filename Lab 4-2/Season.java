/**
 * Season
 */
public class Season {

    public static void main(String[] args) {
        String seasonName = season(6,17);
        System.out.println(seasonName);
    }
    public static String season(int month, int day) {
        String seasonName;
        if(month == 3 && day >= 16){
            seasonName = "Spring";
        }
        else if(month == 4){
            seasonName = "Spring";
        }
        else if(month == 5){
            seasonName = "Spring";
        }
        else if(month == 6 && day <= 15){
            seasonName = "Spring";
        }
        else if(month == 6 && day >= 16){
            seasonName = "Summer";
        }
        else if(month == 7){
            seasonName = "Summer";
        }
        else if(month == 8){
            seasonName = "Summer";
        }
        else if(month == 9 && day <= 15){
            seasonName = "Summer";
        }
        else if(month == 9 && day >= 16){
            seasonName = "Fall";
        }
        else if(month == 10){
            seasonName = "Fall";
        }
        else if(month == 11){
            seasonName = "Fall";
        }
        else if(month == 12 && day <= 15){
            seasonName = "Fall";
        }
        else{
            seasonName = "Winter";
        }
        return seasonName;
    }
}