package Day_25_Loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        while (isHungry) {
            bananas++;
            System.out.println("Eating a banana: " + bananas);
            //isHungry = bananas == countToFull? false : true;
            if (bananas == countToFull) {
                isHungry = false;
            }
        }
    }
}




