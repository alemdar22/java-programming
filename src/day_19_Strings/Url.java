package day_19_Strings;

public class Url {
    public static void main(String[] args) {
        String url = "https://www.amazon.edu";
        if(url.endsWith(".com")){
            System.out.println("commercial website");
        }else{
            if(url.endsWith(".ru")){
                System.out.println("Russian website");
            }else if(url.endsWith(".gov")){
                System.out.println("Government website");
            }else if(url.endsWith(".edu")){
                System.out.println("Education website");
            }else if(url.endsWith("org")){
                System.out.println("organization website");
            }
        }
    }
}
