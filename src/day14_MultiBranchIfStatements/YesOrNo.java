package day14_MultiBranchIfStatements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection = 'y';
        boolean answer ;

        if(selection =='v'){
            System.out.println("Your file will be deleted");
            answer=true;
        }else{
            System.out.println("file deletion is cancelled");
            answer=false;
        }
        System.out.println("Did file get deleted? - "+answer);


    }
}
