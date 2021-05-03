package day_37_methods_Overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(3));
        System.out.println(getDayName(2));
        System.out.println(getDayName(8));

        for (int i =1;i<=8;i++){
            System.out.println(i+" "+getDayName(i));
        }
        String days=getDayName(1); //yeni variablin icine koyduk
        System.out.println(days);

        String someDay=getDayName(8);
        if(someDay==null){  // null testi esit esit ile yapiliyor.(someday.equal  kullanilmiyor)
            System.out.println("invalid day");
        }
        System.out.println("Version2 day "+ getDayNameV2(6));


    }

    public static String getDayName(int day) {
     switch (day){
         case 1:
             return "Monday";
             //break; not reachable does not function
         case 2 :
             return "Tuesday";
         case 3:
             return "Wednesday";
         case 4:
             return "Thursday";
         case 5:
             return "Friday";
         case 6 :
             return "Saturday";
         case 7:
             return "Sunday";
         default:
             System.out.println("Invalid day");
             return null;
     }
       //return null;  burada da kullanilabilir
    }
    public static String getDayNameV2(int day){
        String dayName;

        switch (day){
            case 1:
                dayName="Monday";
                break;
            case 2:
                dayName="tuesday";
                break;
            case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday" ;
                break;
            case 5:
                dayName="Friday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;
            default:
                dayName="Invalid day";
                break;

        }
        return dayName;
    }
}