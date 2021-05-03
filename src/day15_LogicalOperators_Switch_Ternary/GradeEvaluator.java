package day15_LogicalOperators_Switch_Ternary;


public class GradeEvaluator {
    public static void main(String[] args) {

        char grade = 'F';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("You passed with grade " + grade);

        }else if(grade=='D'){
            System.out.println("Qualify for retake");
        }else if(grade=='E'){
            System.out.println("fail");
        }else{
            System.out.println("Invalid grade");
        }

    }
    }