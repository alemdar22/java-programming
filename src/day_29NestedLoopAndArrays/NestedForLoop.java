package day_29NestedLoopAndArrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int minutes=1;minutes<=5;minutes++){
            System.out.println("\nminutes "+minutes);
            for(int seconds=1;seconds<=60;seconds++){
                System.out.print(seconds+" ");
            }
        }
        for(int minute =0;minute<=4;minute++){
            for (int second =0;second<=59;second++){
                System.out.println(minute+":"+second);
            }
        }
    }
}
