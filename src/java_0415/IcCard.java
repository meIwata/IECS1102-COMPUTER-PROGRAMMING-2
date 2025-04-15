package java_0415;

public class IcCard {
    // 屬性
    String number;
    int balance = 0; // 悠遊卡餘額

    // 方法
    int add(int money){
        balance = balance + money;
        return balance;
    }

    //不需要返回的方法
//    public void add(int money) {
//        balance = balance + money;
//    }

    int pay(int money){
        balance = balance - money;
        return balance;
    }

    void printInfo(){
        System.out.println("卡號: " + number + "餘額: " + balance);
    }
}
