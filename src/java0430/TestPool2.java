package java0430;

class Pool2 {
    // 封裝成 private，提供 getQty()
    private int qty;

    public int getQty() {
        return qty;
    }

    // 有參數建構子
    Pool2(int qty) {
        this.qty = qty;
    }

    void addWater() {
        qty += 3;
        System.out.println("進行加水，目前水池水量: " + qty);
    }

    void deductWater() {
        if (qty >= 2) {
            qty -= 2;
            System.out.println("進行減水，目前水池水量: " + qty);
        } else {
            System.out.println("目前水池水量: " + qty + "，無法進行扣水!");
        }
    }
}

public class TestPool2 {
    public static void main(String[] args) {
        Pool2 pool2 = new Pool2(10);
        System.out.println("水池初始水量: " + pool2.getQty());
        pool2.addWater();
        pool2.addWater();
        pool2.deductWater();
        pool2.deductWater();
        pool2.deductWater();
        pool2.deductWater();
        pool2.deductWater();
        pool2.deductWater();
        pool2.deductWater();
        pool2.deductWater();
        pool2.deductWater();
    }
}
