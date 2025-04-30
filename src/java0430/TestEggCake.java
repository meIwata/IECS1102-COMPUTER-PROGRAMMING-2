package java0430;

class EggCake {
    // 成員變數
    int eggCount;

    // 無參數建構方法
    EggCake() {
        // 蛋餅預設給一顆蛋
//    eggCount = 1; // 直接賦值：這是最簡單的方式，直接將值賦給成員變數 eggCount
//    this(1); // this(1) 會呼叫 EggCake(int eggCount)，並傳入參數 1
        this.eggCount = 1; // 明確賦值成員變數：使用 this 關鍵字，明確指定對成員變數 eggCount 的賦值
    }

    // 有參數建構方法
    EggCake(int eggCount) {
        this.eggCount = eggCount + 1;
    }
}

public class TestEggCake {
    public static void main(String[] args) {
        EggCake eggcake1 = new EggCake();
        System.out.println("顧客不要求加蛋，蛋餅裡會有: " + eggcake1.eggCount + "顆蛋");
        EggCake eggcake2 = new EggCake(2);
        System.out.println("顧客要求加蛋，蛋餅裡會有: " + eggcake2.eggCount + "顆蛋");
    }
}
