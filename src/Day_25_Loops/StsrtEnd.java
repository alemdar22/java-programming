package Day_25_Loops;

import java.util.Scanner;

public class StsrtEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start number");
        int start = scan.nextInt();
        System.out.println("Enter end number");
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {
            if (end > start) {
                System.out.println(i);
            }else if (start > end) {
                    System.out.println("reverse is not available");
                }
            }
        }
    }
