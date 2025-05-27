package java0527;

// 訂單
class Order {
    // 成員變數
    private Payment payment;
    private int amount;

    // 建構方法
    public Order(Payment payment) {
        this.payment = payment;
    }

    // 建構方法，只有金額時，預設現金支付
    public Order(int amount) {
        this.payment = new CashPay();
        this.amount = amount;
    }

    // 建構方法，指定付款方式
    public Order(Payment payment, int amount) {
        this.payment = payment;
        this.amount = amount;
    }

    // 一般方法
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void processOrder() {
        payment.pay(amount);
    }
}

interface Payment {
    String LABEL = "支付"; // 以下是完整的修飾詞
//public static final String LABEL ="支付";

    void pay(int amount);

    // 預設付款方法
    default void cashPay(int amount) {
        System.out.println("使用現金支付了" + amount);
    }
}

class LinePay implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("使用LinePay支付了" + amount);
    }
}

class ApplePay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("使用ApplePay支付了" + amount);
    }
}

class CashPay implements Payment {
    @Override
    public void pay(int amount) {
        cashPay(amount); // 使用 default 實作
    }
}

public class TestPayment {
    public static void main(String[] args) {
        Payment linePay = new LinePay();
        Order order1 = new Order(linePay, 100);
        order1.processOrder();

        Payment applePay = new ApplePay();
        Order order2 = new Order(applePay, 200);
        order2.processOrder();

        // 沒有指定付款方式，預設現金
        Order order3 = new Order(300);
        order3.processOrder();

//        Payment.LABEL = "測試修改";
        System.out.println(Payment.LABEL);
    }
}
