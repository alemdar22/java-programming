package day_28_Loops;

public class JavaCity {
    public static void main(String[] args) {
        int totalCases=0;
        for(int day=1;day<=30;day++){
            //totalCases+=200;
            if(day%7==0){
                totalCases+=500;
            }else{
                totalCases+=200;
            }
            System.out.println("Day "+day+ " :"+totalCases);
        }
        System.out.println("Java city total cases :"+totalCases);
    }
}
