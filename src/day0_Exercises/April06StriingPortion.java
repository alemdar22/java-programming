package day0_Exercises;

public class April06StriingPortion {
    public static void main(String[] args) {
        String sentence ="car,cat,sir,red,blue,hat";
        //System.out.println(sentence.substring(0,3));
        for(int i = 0 ; i<sentence.length()-2;i++){
            System.out.println(sentence.substring(i,i+3));
            //String portion1 =sentence.substring(i,i+3); variable haline de gelebilir.
            if(sentence.substring(i,i+3).equals("cat")||sentence.substring(i,i+3).equals("car")){
                //System.out.println("cat or car found"); icerde satir arasina yazar,sayarak
            }
        }
        System.out.println("cat or car found"); // disariya yazar rapor olarak


    }
}
