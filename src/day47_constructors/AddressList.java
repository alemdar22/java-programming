package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress= new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr suit 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("Cybertek school address :"+cybertekAddress.toString());

        cybertekAddress.setStreet("High Gate suit 2211");
        System.out.println("new address :"+cybertekAddress.toString());

        Address newAddress = new Address();
        newAddress.setStreet("100017 Montauk ");
        newAddress.setCity("Bethesda");
        newAddress.setState("MD");
        newAddress.setZipCode("20817");
        System.out.println(newAddress.toString());

        Address papaJohn=new Address();

    }
}
