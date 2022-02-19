package Introduction.SelectionStatements;

public class IfExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasDL = false;

        if(age >= 18) {
            if(hasDL) {
                System.out.println("Can drive");
            }
        }
        else {
            System.out.println("Cannot drive");
        }
    }
}
