package day_30_Arrays;

public class StudentArrayExercise {
    public static void main(String[] args) {
        String [] student = {"11221","Joe","Barber","99909","561-449 7748"};
        System.out.println(" id number : "+student[0]);
        System.out.println(" name and surname : "+student[1]+" "+student[2]);
        System.out.println("batch number : "+student[3]);
        System.out.println("phone number "+student[4]);

        for (int i=0;i<student.length;i++){
            //System.out.println(student[0].length()==student[3].length());
            if(student.length==5){

            }
        }
        System.out.println("match");
        System.out.println(student[0].length()==student[3].length());
        System.out.println();


        System.out.println(student[1].toUpperCase()+" "+student[2].toUpperCase());

        System.out.println(student[1].substring(0,1));
        String mobile = student[4];
        System.out.println(mobile);
        System.out.println(mobile.startsWith("561"));
        System.out.println(student[1].replace("Joe","Bill"));

        int [] numList ={7,8,6,55,44,33,45,22,12};
        for (int i = 0 ; i<numList.length;i++){
            System.out.print(numList[i]+ " ");
        }
        System.out.println();

       for ( int each :numList){
           System.out.print(each+" | ");
       }
    }
}
