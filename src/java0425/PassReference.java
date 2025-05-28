package java0425;

// 課本案例8-18
class TestA {
    int x = 3;

    void show() {
        System.out.println("x = " + x);
    }
}

class TestB{
    void changeTestA(TestA t, int newX){

        t.x = newX;
    }
}

public class PassReference {
    public static void main(String[] args) {
        TestA a = new TestA();
        TestB b = new TestB();
        a.show(); // x = 3
        b.changeTestA(a, 20); // 將 a 傳進去，並請 b 物件把 a 的 x 改成 20
        a.show();
    }
}
