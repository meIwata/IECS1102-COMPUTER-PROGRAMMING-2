package java0415;

public class IcCard {
    // 屬性
    // 成員變數
    public String number;
    public int balance = 0; // 悠遊卡餘額

    // (成員)方法
    public int add(int money) { //(int money)參數列
        balance = balance + money;
        return balance;
    }

    //不需要返回的方法
//    public void add(int money) {
//        balance = balance + money;
//    }

    public int pay(int money) {
        balance = balance - money;
        return balance;
    }

    public boolean topup(int money) {
        if (money < 0) {
            return false;
        } else {
            balance = balance + money;
            return true;
        }
    }

    public boolean expense(int money) {
        if (money > balance || money < 0) {
            return false;

        } else {
            balance = balance - money;
            return true;
        }
    }


    public void printInfo() { //()沒有放參數，且不需要回傳值
        System.out.println("卡號: " + number + " 餘額: " + balance);
        /*在 Java 中，void 方法代表「不需要回傳值」，所以可以寫 return;，但這是可選的。*/
        // return; // 可以加，也可以不加
    }
}
