package OOPS.Inheritance;

class C {
    int a; //inheritable property
    private int b; //non-inheritable property

    void showC() {
        System.out.println("In class C: a = " + a);
        System.out.println("In class C: b = " + b);
    }

    //getter method
    public int getB() {
        return b;
    }

    //setter method
    public void setB(int n) {
        b = n;
    }
}

class D extends C {
    int c;

    void showD() {
        System.out.println("In class D: a = " + a);
        System.out.println("In class D: c = " + c);
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        C c = new C();
        c.a = 10;
        c.setB(20);
        c.showC();

        D d = new D();
        d.a = 100;
        d.showC();
        d.showD();
    }
}
