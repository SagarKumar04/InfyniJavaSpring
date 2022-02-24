package OOPS;

public class ConstructorExample {
    int num1;
    int num2;

    //default constructor
    ConstructorExample() {
        num1 = 10;
        num2 = 20;
    }

    //parameterized constructor
    ConstructorExample(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    public static void main(String[] args) {
        ConstructorExample constructorExample1
                = new ConstructorExample();
        System.out.println("num1: " + constructorExample1.num1);
        System.out.println("num2: " + constructorExample1.num2);

        ConstructorExample constructorExample2
                = new ConstructorExample(14, 28);
        System.out.println("num1: " + constructorExample2.num1);
        System.out.println("num2: " + constructorExample2.num2);
    }
}
