package day48;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {// this class is to run the code

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1.toString());//prints with default value
        customer1.setId(1);
        customer1.setName("Bob");
        System.out.println(customer1);
        Customer customer2 = new Customer("Mike", 2);//assigning values in the same statement
        Customer customer3 = new Customer("Ben", 11223);
        System.out.println(customer2);
        System.out.println(customer3);

        //array of customers
        Customer[] todaysCustomers = {customer1, customer2, customer3, new Customer("Ali", 2233)};

        //arrayList of Customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(new Customer("Hans", 345));
        customerList.add(new Customer("Bill", 8998));

        //print info of first customer object in array
        System.out.println(todaysCustomers[0].toString());
        //print from arrayList
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList.get(2).toString());

        System.out.println(customerList);

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        for (Customer each : customerList) {    // collection adi string degil customer
            System.out.println(each);
        }

        //print customer names only
        customerList.forEach(each-> System.out.println(each.getName()));//lambda method
        for(Customer each :customerList){
            System.out.println(each.getName());
        }


    }
}

