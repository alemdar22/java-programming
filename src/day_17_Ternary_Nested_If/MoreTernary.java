package day_17_Ternary_Nested_If;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply " + reply);

        String todayClass = "java";

        String teacher = (todayClass.equals("java")) ? "Saim/Murodil" : "Nadir";
        System.out.println(teacher);

        boolean isEligibletoDrive = true;
        String driving = (isEligibletoDrive) ? "is eligible" : " not eligible";
        System.out.println(driving);


    }
}