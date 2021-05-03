package day_40_ArrayList;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        ArrayList list11 = new ArrayList(); // raw arrayList
        List list2 = new ArrayList();// polymorfic way

        list11.add("java");
        list11.add("coffee");
        list11.add(true);
        list11.add("huhu");
        list11.add(1234);

        System.out.println(list11);
        System.out.println(list11.size());

        ArrayList<Integer>nums= new ArrayList<>();//Restricted type


    }
}
