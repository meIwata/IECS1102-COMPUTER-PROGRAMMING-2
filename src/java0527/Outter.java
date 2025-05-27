package java0527;

public class Outter {
    private int a = 10;
    private int b = 15;
    static int c = 20;

    void callInner() {
        Inner inner = new Inner();
        inner.print();
    }

    class Inner {
        private int b = 30;
        private int d = 40;

        void print() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(Outter.this.b);
            System.out.println(Outter.c);
        }
    }

    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.callInner();
    }
}
