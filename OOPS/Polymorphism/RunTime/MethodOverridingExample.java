package OOPS.Polymorphism.RunTime;

//super class, or parent class
class A {
    void show() {
        System.out.println("In class A");
    }
}

//sub class, or child class
class B extends A {
    void show() {
        super.show();
        System.out.println("In class B");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        B b = new B();

        b.show();
    }
}
