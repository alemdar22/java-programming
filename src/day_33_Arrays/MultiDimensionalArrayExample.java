package day_33_Arrays;
import java.util.*;
public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
        String [][] users = new String[3][2];
        users[0][0]="ramiz";
        users[0][1]="huhu22";
        users[1][0]="saim";
        users[1][1]="pasword333";

        String [][] userData={{"ramiz huhu22"},{"saim pasword333"},{"al kl89"}};

        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);
        /**System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);*/

        System.out.println(Arrays.deepToString(userData));
    }
}
