package Introduction;

public class Example1 {
    public static void main(String[] args) {
        int age = 20;
        boolean hasDrivingLicense = false;

        boolean canDrive = (age >= 18) && (hasDrivingLicense);

        System.out.println(canDrive);
    }
}