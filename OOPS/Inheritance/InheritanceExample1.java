package OOPS.Inheritance;

//parent class
class A {
    float a;

    void showA() {
        System.out.println("In class A: " + a);
    }
}

//child class
class B extends A {
    int b;

    void showB() {
        System.out.println("In class B: " + b);
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        A a = new A();
        a.a = 3.14f;
        a.showA();

        B b = new B();
        b.a = 10.12f;
        b.b = 20;
        b.showA();
        b.showB();
    }
}
