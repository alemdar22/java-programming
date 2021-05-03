package day_17_Ternary_Nested_If;

public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'M';
        String trim = "Plaid";
        if (model == 'S') {
            System.out.println("model selected: "+model);
            if(trim.equals("Long range"))
            System.out.println("trim selected: "  + trim);
            System.out.println("range: 412");
            System.out.println("top speed: 155 mph");
            System.out.println("0-60- 3.1sec");
        }else if(model =='M'){
            if(trim.equals("Plaid")){
                System.out.println("trim selected: "  + trim);
                System.out.println("range: 472");
                System.out.println("top speed: 165 mph");
                System.out.println("0-60- 2.5sec");
            }else{
                System.out.println("Invalid model selection");
            }
        }


        }

    }

