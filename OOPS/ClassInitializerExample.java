package OOPS;

public class ClassInitializerExample {
    //class initializer
    static {
        System.out.println("In class initializer");
    }

    //instance initializer
    {
        System.out.println("In instance initializer");
    }

    //constructor
    ClassInitializerExample() {
        System.out.println("In constructor");
    }

    public static void main(String[] args) {
        System.out.println("In main().");

        ClassInitializerExample classInitializerExample
                = new ClassInitializerExample();
    }
}
