package day0_Exercises;

public class April14MethodsWithParameters {
    public static void main(String[] args) {
        studentID("Inci","Alemdaroglu","angiealemdar@hotmail.com");
        studentID("Al","Parker","park@tutu.com");

        readBook("AlCapone","Street",2);


    }
    public static void studentID(String name,String surname,String email){
        System.out.print("Our new SDET is : ");
        System.out.println(name+" "+surname+" "+email);
        countMe(5);
        countMe(10);
        whatIhave("Toyota",1000,'B');
    }

    public static void countMe(int num){
        for ( int i = 0;i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void whatIhave(String carBrand,int moneyInBank,char licenseType){
        System.out.println("I have "+carBrand+", "+moneyInBank+" and "+licenseType
                +" driver license");
    }
    public static void readBook(String bookName1,String bookname2,int bookCount){
        System.out.println("I read "+bookCount+" books,named "+bookName1+" and "+bookname2);
    }
}