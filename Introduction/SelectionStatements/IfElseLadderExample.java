package Introduction.SelectionStatements;

public class IfElseLadderExample {
    public static void main(String[] args) {
        int marks = 80;

        if(marks >= 90) {
            System.out.println("Grade O");
        }
        else if(marks >= 80 && marks < 90) {
            System.out.println("Grade E");
        }
        else if(marks >= 70 && marks < 80) {
            System.out.println("Grade A");
        }
        else {
            System.out.println("Fail");
        }
    }
}
