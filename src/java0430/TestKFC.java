package java0430;

class KFC {
    // 成員變數
    int iceCube;

    // 無參數建構方法
    KFC() {
        // 預設不給冰塊
        this(0); // this(1) 會呼叫 KFC(int iceCube)，並傳入參數 0
    }

    // 有參數建構方法
    KFC(int iceCube) {
        this.iceCube = iceCube;
    }
}

public class TestKFC {
    public static void main(String[] args) {
        KFC coke = new KFC();
        System.out.println("張三點的是，" + coke.iceCube +" 顆冰塊的可樂！");

        KFC icetea = new KFC(10);
        System.out.println("小美點的是，" + icetea.iceCube +" 顆冰塊的紅茶！");
    }
}
