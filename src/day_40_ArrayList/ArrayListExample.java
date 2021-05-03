package day_40_ArrayList;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
      ArrayList<Integer> nums = new ArrayList<>();
      nums.add(3);
      nums.add(22);
      nums.add(19);
        System.out.println(nums.size());
        System.out.println("index 0 = "+nums.get(0));
        System.out.println("index 0 = "+nums.get(1));
        System.out.println("index 0 = "+nums.get(2));

        System.out.print(nums);
        nums.remove(1);// removes element at index 1
    }
}
