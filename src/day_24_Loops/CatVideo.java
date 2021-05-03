package day_24_Loops;

public class CatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;

        while(seconds<=117){
            System.out.println("Watching the video "+seconds);
            seconds++;
            Thread.sleep(500);
        }
        System.out.println("Finished watching the video");
    }
}
