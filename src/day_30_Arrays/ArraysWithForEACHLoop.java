package day_30_Arrays;

public class ArraysWithForEACHLoop {
    public static void main(String[] args) {

        int[] data = {23, 89, 876, 345, 221, 999, 909, 887, 55};

        for (int each : data) { //variable declare ediyorsun.
            System.out.print(each + " ");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.println(data[data.length - 1]);
        System.out.println();

        for (int m = data.length - 1; m >= 0; m--) { // reverse
            System.out.print(data[m] + " ");
        }
    }

}
