package day_30_Arrays;

public class ForEachLoopExercise {
    public static void main(String[] args) {
        int [] myArray={33,55,43,21,11,232,444};

        for (int each : myArray){
            System.out.print(each+" | ");
            System.out.println();
        }
        System.out.println(myArray[myArray.length-1]);

        for (int i=myArray.length-1;i>=0;i--){
            System.out.print(myArray[i]+" ");
        }


    }
}
