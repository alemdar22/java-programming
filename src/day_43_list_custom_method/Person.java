package day_43_list_custom_method;
//firstname,age
public class Person {
    //Data, variable
 String firstname;
 int age;
 char gender;
 //behaviour
    public void speak(){
        System.out.println("Person is speaking");
    }
}

class People{// people class is for running the code
    public static void main(String[] args) {
        //created object from Person class- instantiate
        Person person1 = new Person();
        person1.firstname="Bob";
        person1.age=33;
        person1.gender='M';
        person1.speak();

        System.out.println(person1.firstname);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2=new Person();
        person2.firstname= "Tim";
        person2.age=24;
        person2.gender='F';
        person2.speak();


        System.out.println(person2.firstname);
        System.out.println(person2.age);
        System.out.println(person2.gender);




    }
}
