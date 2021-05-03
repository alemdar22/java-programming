package day0_Exercises;

public class April02_IsHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 4;

        while (isHungry) {
            bananas++;
            System.out.println("eat " + bananas);
            if (bananas == countToFull) {
                isHungry = false;
                bananas += 1;

            }


        }

    }
}