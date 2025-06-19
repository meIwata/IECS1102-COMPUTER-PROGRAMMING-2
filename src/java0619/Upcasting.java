package java0619;
/**
 * 不需強制轉型，Java 會自動處理。
 * 變數只看得到父類別的方法或屬性（但如果方法被子類別覆寫，會執行子類別的版本）。
 * 常用於多型（polymorphism）、介面設計、參數傳遞等情境。
 * */
class Father {
    void sayHello() {
        System.out.println("Hello from Father");
    }
}

class Son extends Father {
    void sayHello() {
        System.out.println("Hello from Son");
    }
    void play() {
        System.out.println("Son is playing");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        // 向上轉型：兒子變爸爸
        Father f = new Son();  // 這裡就是「兒子變爸爸」
        f.sayHello();          // 會輸出 "Hello from Son"（多型）
        // f.play();           // 錯誤！Father 型態看不到 play()
    }
}
