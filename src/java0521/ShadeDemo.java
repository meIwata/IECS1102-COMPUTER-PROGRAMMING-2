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

        /*
        * instanceof用法
        * 變數名稱 instanceof 類別名稱
        * 當左邊的物件是右邊類別或其子類別的實例時，會回傳 true，否則回傳 false。
        */
    }
}
