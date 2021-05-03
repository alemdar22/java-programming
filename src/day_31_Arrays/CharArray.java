package day_31_Arrays;

public class CharArray {
    public static void main(String[] args) {
        char [] letters ={'j', 'a', 'v', 'a', ' ', 'i', 's', ' ','f', 'u', 'n'};

        for (char each :letters){
            System.out.print(each);
        }
        System.out.println();
        String sentence = new String (letters);// converting char Array into string
        System.out.println(sentence);

        String item="wooden spoon";  // convert String to Char Array
        char [] itemArray= item.toCharArray();
        System.out.println(itemArray.length);
        System.out.println(item.length());

        String [] fruit={"bananas","apples","mango","papaya","strawberry"};
        System.out.println(fruit[0]+"-"+fruit[1]);
         String strFruit="";
        for (String list:fruit){
            //System.out.print(list+"-");
            strFruit+=list+"-";
        }
        System.out.println(strFruit);

        String [] languages={"java","phyton","c++","sql","ruby","javascript"};
        String.join("|",languages);
        System.out.println( String.join("|",languages));

        System.out.println(String.join(" & ",languages));
    }
}
