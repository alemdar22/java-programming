package day_32_Arrays_Split;

import java.util.Arrays;

public class LoopWithTwoVariables {
    public static void main(String[] args) {
        for (int i = 1, j = 1; i <= 4; i++, j++) {
            System.out.println("i= " + i + " j= " + j);
        }
        System.out.println();
        for(int i = 1,j=5; j>=0;i++,j--){
            System.out.println("i= " + i + " j= " + j);
        }

        int num1= 10;
        int num2=20;
        int temp= 10;
         num1=num2;
         num2=temp;
        System.out.println(num1+" "+num2);
        System.out.println();

        int [] numList ={1,3,4,5};
        numList[0]=numList[3];
        numList[3]=temp;

        System.out.println(Arrays.toString(numList));

        String [] words={"java","html","js","ruby","c++"};
        System.out.println(Arrays.toString(words));
        for(int i = 0,j= words.length-1;i<words.length/2;i++,j--){
            String tempWord=words[i];
            words[i]=words[j];
            words[j]=tempWord;
        }
        System.out.println(Arrays.toString(words));



    }
}
