package OOPS.Polymorphism.CompileTime;

public class FunctionOverloadingExample1 {
    static void add() {
        System.out.println("In add()");
    }

    static void add(int a) {
        System.out.println("In add(int): a = " + a);
    }

    static void add(float a) {
        System.out.println("In add(float): a = " + a);
    }

    public static void main(String[] args) {
        add();
        add(10);
        add(3.14159f);
    }
}
