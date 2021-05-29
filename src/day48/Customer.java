package day48;

public class Customer {
    private String name;
    private int id;

    //No args constructor
    public Customer(){
        System.out.println("No args constructor");
        name="new customer";
        id=0;
    }
    //adding constructor where we assign name and id
    public Customer(String name,int id){
        System.out.println("2 args constructor");
        this.name=name; //setName();  setter ile  de yapilabilir.
        this.id=id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {// condition oldugunda bunu kullan
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

