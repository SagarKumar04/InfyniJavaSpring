package Introduction;

//importing Scanner class
import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args) {
        //create an object of Scanner class
        /*
        Syntax of creating an object:
        class-name object-name = new class-name();
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Do you have a driving license?: ");
        boolean hasDrivingLicense = scanner.nextBoolean();

        boolean canDrive = (age >= 18) && hasDrivingLicense;

        System.out.println("Your age: " + age);
        System.out.println("Has DL: " + hasDrivingLicense);
        System.out.println("Result: " + canDrive);
    }
}
