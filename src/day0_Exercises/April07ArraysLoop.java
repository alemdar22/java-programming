package day0_Exercises;

public class April07ArraysLoop {
    public static void main(String[] args) {
        int [] codeNum={223,312,344,432,454,443,221,789,999,990};
        String [] city ={"DC","NY","LA","NJ",};

        System.out.println(codeNum[0]+" "+city[0]);
          int count=0;
        for (int each : codeNum){
            if(each<300){
                count++;
               // System.out.println(count);
            }
        }
        System.out.println(count);
    }
}
