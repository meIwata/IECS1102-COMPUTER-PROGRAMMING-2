package java0430;

class Pool2 {
    // 封裝成 private，提供 getQty()
    private int qty;
//    private static int qty;

    public int getQty() {
        return qty;
    }

    // 有參數建構子
    Pool2(int qty) {
        this.qty = qty;
    }

    void addWater() {
//    static void addWater() {
        qty += 3;
        System.out.println("進行加水，目前水池水量: " + qty);
    }

    void deductWater() {
//    static void deductWater() {
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
        /* 如果類別裡面的成員變數跟方法都加上static，那所有new出來的實例都可以去操作初始化的水量
           意思就是 加入使用者，大家都可以控制同一個水池的初始水量
        */
//        Pool2 pool2 = new Pool2(10); // pool2 初始化水量為10
//        System.out.println("水池初始水量: " + pool2.getQty());
//        Pool2 pool22 = new Pool2(5); // pool22 把水量又改成5
//        System.out.println("水池初始水量: " + pool22.getQty());
//        Pool2.deductWater();

        //沒有加上static，個別創建實例，個別操控自己的水池
        Pool2 pool2 = new Pool2(10); // pool2 初始化水量為10
        System.out.println("水池初始水量: " + pool2.getQty());
        pool2.addWater();
        pool2.deductWater();

        Pool2 pool22 = new Pool2(5); // pool22 把水量又改成5
        System.out.println("水池初始水量: " + pool22.getQty());
        pool22.addWater();
        pool22.deductWater();


    }
}
