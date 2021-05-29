package day0_Exercises;

import day47_constructors.Student;

public class StudentAlemdar {

    private String name;
    private String lastName;
    //no args consturctor
    public StudentAlemdar(){
        System.out.println("no args constructor");
    }
    public StudentAlemdar (String name ){
        System.out.println("name parameter "+name);
    }
    public StudentAlemdar (String name,String lastName){
        System.out.println(name +" "+lastName);
    }
    public StudentAlemdar(int age){
        System.out.println(" param with age "+age);
    }


}
