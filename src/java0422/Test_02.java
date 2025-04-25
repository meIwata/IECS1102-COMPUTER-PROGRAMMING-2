package java0422;

import java0415.IcCard;

public class Test_02 {
    public static void main(String[] args) {
        IcCard myCard = new IcCard();
        myCard.number = "D111";
        myCard.balance = 100;
        myCard.printInfo();

//        myCard.add(100);
//        System.out.println("餘額: " + myCard.balance);
//        myCard.printInfo();

//        int newBalance = myCard.add(100);
//        System.out.println("餘額: " + newBalance);


        boolean isTopup = myCard.topup(-300);
        System.out.println(isTopup);
        myCard.printInfo();

        boolean isExpense = myCard.expense(-200);
        System.out.println(isExpense);
        myCard.printInfo();


    }
}
