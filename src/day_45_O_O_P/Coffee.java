package day_45_O_O_P;

public class Coffee {
    String type;
    int amount;

    public void refill(){
        amount=100; // refilled
    }
    public void  drink(int someAmount){
        amount-=someAmount;
    }
    public int getAmount(){
        return amount;
    }
    public void setType(String newType){
        type=newType;
    }
    public String getType(){
        return "type";
    }
}
