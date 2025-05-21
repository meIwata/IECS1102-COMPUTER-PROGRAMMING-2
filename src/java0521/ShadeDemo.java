package java0521;

class Quadrangle {

}

class Square extends Quadrangle {

}

class Circle {

}

public class ShadeDemo {
    public static void main(String[] args) {
        Quadrangle q = new Quadrangle();
        Square s = new Square();
        System.out.println(q instanceof Square); // false
        System.out.println(s instanceof Quadrangle); // true
//        System.out.println(q instanceof Circle);
    }
}
