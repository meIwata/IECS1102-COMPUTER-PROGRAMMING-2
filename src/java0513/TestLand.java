package java0513;

class Land {
    double area() {
        return 0;
    }
}

class Circle extends Land {
    int r;

    Circle(int r) {
        this.r = r;
    }

    @Override
    double area() {
        return 3.14 * r * r;
    }
}

class Square extends Land {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

class Calculator {
    double price;

    Calculator(double price) {
        this.price = price;
    }

    double calculatorPrice(Land l) {
        return l.area() * price;
    }
}

public class TestLand {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(5);

        Calculator ca = new Calculator(3000.0);
        System.out.println("c 這塊土地價值: " + ca.calculatorPrice(c));
        System.out.println("s 這塊土地價值: " + ca.calculatorPrice(s));
    }
}
