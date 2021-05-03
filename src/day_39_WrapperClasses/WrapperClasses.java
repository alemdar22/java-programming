package day_39_WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        int num =100; // simple primitive no action
        Integer n = new Integer(20); // first way to declare a variable// object oldu
        System.out.println("is n value 20? "+n.equals(20));

        Integer m = 50; // 2nd way to declare a variable
       String str = m.toString();  //integer object i string e assign ettik

        String str11= m+""; // bu sekilde de string yapabiliyoruz.

        //byte b1 = new Byte(5);
        Byte b2 = 10;
        //short s1 = new Short(50);
        Short s2 = 25;
        int i1= new Integer(12);
        Integer i2= 15;
        long l1 = new Long(888L);
        Long l2 = 777L;
        float f1= new Float(233.3F);
        Float f2= 77.9F;
        double d1 = new Double(4.2);
        Double d2 = 20.9;
        char ch1= new Character('A');
        Character ch2 = 'B';
        boolean bb1= new Boolean(true);
        Boolean bb2=true;






    }
}
