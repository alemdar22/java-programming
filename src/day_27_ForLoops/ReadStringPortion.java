package day_27_ForLoops;

public class ReadStringPortion {
    public static void main(String[] args) {
       String list= "cat,car,cat,red_car,java,selenium";
        //int i=0;
       // System.out.println(list.substring(i,i+3));
       // i++;
       // //System.out.println(three);
        //System.out.println(list.substring(1,4));
        //System.out.println(list.substring(2,5));
       // System.out.println(list.substring(3,6));
       // System.out.println(list.substring(4,7));

        for (int i = 0; i <list.length()-2 ; i++) {
            System.out.println(list.substring(i,i+3));
            // String partString="list.substring(i,i+3)"; diye variable da olabilir
            if(list.substring(i,i+3).equals("cat")||list.substring(i,i+3).equals("car")){
                System.out.println("cat or car  found");
            }
        }
    }
}
