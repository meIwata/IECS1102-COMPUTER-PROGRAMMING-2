package java0430;

class CreditCard {
    String cardNumber;
    int password;

    CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
        this.password = 123456;
        printMessage();
    }

    CreditCard(String cardNumber, int password) {
        this.cardNumber = cardNumber;
        this.password = password;
    }

    void printMessage() {
        System.out.print("沒有設定密碼，給你預設密碼! ");
    }
}

public class TestCreditCard {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("8888-8888-8888-8888", 987654321);
        System.out.println("卡號1已完成開卡，卡號: " + card1.cardNumber + "  密碼: " + card1.password);

        CreditCard card2 = new CreditCard("6666-6666-6666-6666");
        System.out.println("卡號2已完成開卡，卡號: " + card2.cardNumber + "  密碼: " + card2.password);
    }
}
