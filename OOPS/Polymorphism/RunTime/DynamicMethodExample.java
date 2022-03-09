package OOPS.Polymorphism.RunTime;

class Figure {
    double dim1; //3.14, 10.43, 10, ....
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area of Figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area() of Rectangle class");
        return (dim1 * dim2);
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area() of Triangle class");
        return (dim1 * dim2 / 2);
    }
}

public class DynamicMethodExample {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figRef;

        figRef = r;
    }
}
