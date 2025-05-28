package java0415;

public class TestIcCard {
    public static void main(String[] args) {
        IcCard myCard = new IcCard(); // 前面要寫型別，生成物件的型別就是類別，myCard是屬於IcCard型別
        myCard.number = "C1234";
        myCard.balance = 100;
        int a = myCard.balance; //存值
        System.out.println(a); //取值
        myCard.printInfo();

        // 使用方法儲值
        int result = myCard.add(100); //儲值100
        System.out.println(result);
        myCard.printInfo(); //印出餘額


        IcCard yourCard = new IcCard(); // 前面要寫型別，生成物件的型別就是類別，myCard是屬於IcCard型別
        yourCard.number = "C5678";
        yourCard.balance = 300;
        yourCard.printInfo();

        // 使用方法儲值
        yourCard.add(50); //儲值50
        yourCard.printInfo(); //印出餘額
    }
}
