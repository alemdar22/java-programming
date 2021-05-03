package day_30_Arrays;

public class StudentArray {
    public static void main(String[] args) {
        String [] student1={"ID 2322","Alemdar","Alemdaroglu","22","561-4499998"};// 5 element.
        System.out.println("student1 id : "+student1[0]);
        System.out.println("student name : "+student1[1]);
        System.out.println("student surname : "+student1[2]);
        System.out.println("student batch number : "+student1[3]);
        System.out.println("phone number : "+student1[4]);
        String [] student2={"ID 2222","Alem","Alemdaroglu","20","561-4498899"}; //4 element

        System.out.println(student1.length);

        if(student1.length==5){
            System.out.println("pass : data has correct length");
        }else{
            System.out.println("Fail : data array length is incorrect");
        }

        if(student1.length==student2.length){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        System.out.println(student1[1].toUpperCase()+" "+student2[2].toUpperCase());


    }
}
