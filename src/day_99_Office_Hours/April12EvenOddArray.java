package day_99_Office_Hours;

import java.util.Arrays;

public class April12EvenOddArray {
    public static void main(String[] args) {
        int [] numbers = {23,10,9,12,90};
        System.out.println(Arrays.toString(numbers));
        int odd=0;
        int even=0;

        for (int each : numbers){
            if(each%2==0){
                even++;

            }else{
                odd++;
            }
        }
        //int [] evenNumbers= new int[even];
        //int [] oddNumbers = new int[odd];
        System.out.println("even count "+even);
        System.out.println("odd count "+odd);

        System.out.println();


        }
    }

