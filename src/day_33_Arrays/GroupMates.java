package day_33_Arrays;

public class GroupMates {
    public static void main(String[] args) {
        String [] groupMates={"Victor","Foam","Ozan","Ana","Lynn","Frejus","Bradley",
                "Manatsineem","Mahliya","Anastasia"};

        for(String each:groupMates){
            System.out.println(each+" Happy holidays!");
        }
        System.out.println();
        for (int i =0;i<=groupMates.length;i++){
            System.out.println(groupMates[i]+" Happy holidays");

        }

    }
}
