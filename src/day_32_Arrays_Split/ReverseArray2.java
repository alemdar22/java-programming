package day_32_Arrays_Split;
import java.util.*;
public class ReverseArray2 {
    public static void main(String[] args) {
        int num1= 10;
        int num2=20;
        int temp= 10;
        num1=num2;
        num2=temp;
        System.out.println(num1+" "+num2);
        System.out.println();

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

