package day_41_Arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> cars= new ArrayList<>();
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Lexus");
        cars.add("Fiat");
        cars.add("Volvo");
        cars.add("Tesla");
        cars.add(0,"Jeep");
        cars.add(1,"Lada");
        cars.add(2,"Toyota");
        System.out.println(cars);
        System.out.println("cars "+cars.toString());
        String allCars=cars.toString(); // saves all cars in 1 string
        System.out.println("all cars in 1 string "+allCars);// string oldu
        //change index 0 into Renault
        cars.set(0,"Renault");
        System.out.println(cars);
        cars.set(1,"Mazda");
        System.out.println(cars);
        /** if it was ARRAY
         * cars [1]="Mazda"
         */
        //indexOf method>>> find index of Ford
        System.out.println(cars.indexOf("Ford"));
        int fordIndex= cars.indexOf("Ford");
        //change ford to kia
        cars.set(fordIndex,"Kia");
        System.out.println(cars);// ford is gone,replaced by kia


        cars.set(fordIndex,"Traban");
        System.out.println(cars);

        for (int i =0;i<cars.size();i++){
            if(cars.get(i).equals("Renault")){
                cars.set(i,"Anadol");
                System.out.println(cars);
            }else if(cars.get(i).equals("Fiat")){
                cars.set(i,"Tata");
                System.out.println(cars);
            }else
                System.out.println("aaa");

            }
        }

    }
