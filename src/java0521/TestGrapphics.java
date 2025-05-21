package java0521;

class Quadrangle2 {
    public String getCategory() {
        return "我屬於平行四邊形";
    }
}

class Circle2 {
    public String getCategory() {
        return "我屬於圓型";
    }
}

public class TestGrapphics {
    static void Graphics(Object obj) {
        if (obj instanceof Quadrangle2) {
            Quadrangle2 q = (Quadrangle2) obj;
            System.out.println(q.getCategory());
        } else if (obj instanceof Circle2) {
            Circle2 c = (Circle2) obj;
            System.out.println(c.getCategory());
        }
    }

    public static void main(String[] args) {
        Circle2 c2 = new Circle2();
        Graphics(c2);
    }
}
