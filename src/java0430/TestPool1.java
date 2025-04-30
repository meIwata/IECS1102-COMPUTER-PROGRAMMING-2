package java0430;

class Pool1 {
    static int qty = 0;

    static void addWater() {
        qty += 3;
    }

    static void deductWater() {
        qty -= 2;
    }

    static void printQty() {
        System.out.println("當前水量: " + qty);
    }
}

public class TestPool1 {
    public static void main(String[] args) {
        // 直接使用靜態方法調用
        System.out.println("水池初始水量: " + Pool1.qty);
        Pool1.addWater();
        Pool1.addWater();
        Pool1.addWater();
        Pool1.addWater();
        Pool1.deductWater();
        Pool1.printQty();
    }
}
