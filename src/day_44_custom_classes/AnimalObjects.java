package day_44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
     Animal animalObject= new Animal();
        System.out.println(animalObject.type);
        animalObject.eat();
        animalObject.eat("bones");

        animalObject.speak();

        Animal cheetahObject= new Animal();//creating new animal object variable named cheetah
        cheetahObject.type= "cheetah"; //type reassigned as cheetah
        System.out.println(cheetahObject.type);
        cheetahObject.eat("meat");
    }
}
