package OOPS;

public class ClassExample {
    int num1; //instance variables or non-static variables
    int num2; //instance variables or non-static variables

    static int sum; //class variable or static variables

    public static void main(String[] args) {
        /*
        Syntax (for creating an object):
        class-name object-name = new class-name();
         */
        ClassExample classExample1 = new ClassExample();
        classExample1.num1 = 10;
        classExample1.num2 = 20;

        sum = classExample1.num1 + classExample1.num2;

        System.out.println("Sum: " + sum);
    }
}
