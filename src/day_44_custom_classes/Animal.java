package day_44_custom_classes;

public class Animal {
    String type="dog";

    public void eat(){ // behaviour adding
        System.out.println("eating");
    }

    public void eat(String food){

        System.out.println("eating "+ food);
    }

    public void speak(){
        System.out.println("speaking");
    }



}

