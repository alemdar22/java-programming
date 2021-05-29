package day0_Exercises;

public class StudentObjectsAlemdar {
    public static void main(String[] args) {
        StudentAlemdar studentAlemdar1=new StudentAlemdar();
        StudentAlemdar studentAlemdar2=new StudentAlemdar();
        StudentAlemdar studentAlemdar3=new StudentAlemdar("Mike");
        StudentAlemdar studentAlemdar4=new StudentAlemdar("Mike","Smith");
        StudentAlemdar studentAlemdar5=new StudentAlemdar(55);
        System.out.println(studentAlemdar1.equals(studentAlemdar2));//ben ekledim
    }
}
