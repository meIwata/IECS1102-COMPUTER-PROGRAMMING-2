package java0619;
/**
 * 必須用「強制型別轉換」。
 * 父類別變數本身必須參考（指向）子類別物件，否則會發生 ClassCastException 例外。
 * 向下轉型後，可以存取子類別特有的方法或屬性。
 * */
class Father2 {
    void sayHello() {
        System.out.println("Hello from Father");
    }
}

class Son2 extends Father2 {
    void sayHello() {
        System.out.println("Hello from Son");
    }
    void play() {
        System.out.println("Son is playing");
    }
}
public class Downcasting {
    public static void main(String[] args) {
        Father2 f = new Son2();  // 先向上轉型（父變數指向子物件）
        f.sayHello();          // "Hello from Son"

        // 向下轉型：爸爸變回兒子
        Son2 s = (Son2) f;

        s.play();              // "Son is playing"
    }
}
