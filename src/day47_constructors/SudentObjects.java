package day47_constructors;

public class SudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        Student student3= new Student("Mustafa");
        Student student4= new Student("Ben");

        Student student5= new Student("Fred ",46);
    }
}
