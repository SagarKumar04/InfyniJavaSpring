package OOPS;

public class FunctionExample {
    /*
    Syntax:
    [access-specifier] [static] return-type method-name(parameter-list) {
        //body of the method

        [return val];
    }
     */
    int add1(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }

    void add2(int num1, int num2) {
        int sum = num1 + num2;

        System.out.println("sum2: " + sum);
    }

    int add3() {
        int num1 = 10;
        int num2 = 27;

        int sum = num1 + num2;

        return sum;
    }

    void add4() {
        int num1 = 10;
        int num2 = 27;

        int sum = num1 + num2;

        System.out.println("sum4: " + sum);
    }

    public static void main(String[] args) {
        FunctionExample functionExample
                = new FunctionExample();

        int sum1 = functionExample.add1(1, 2);
        System.out.println("sum1: " + sum1);

        functionExample.add2(12, 24);

        int sum3 = functionExample.add3();
        System.out.println("sum3: " + sum3);

        functionExample.add4();
    }
}
