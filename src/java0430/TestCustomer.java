package java0430;

class Customer {
    static int count = 0;
    String name;

    Customer(String name) {
        this.name = name;
        count++;
    }
    static void printInfo(Customer customer){ // 必須要加上static，底下的main才能取用
        // 打印客户信息
        System.out.println(customer.name + "是今天第: " + Customer.count + "個客戶");
    }
}

public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer("小李");
//        System.out.println(c1.name + "是今天第: " + Customer.count + "個客戶");
        Customer.printInfo(c1); // 利用靜態方法呼叫


        Customer c2 = new Customer("小明");
//        System.out.println(c2.name + "是今天第: " + Customer.count + "個客戶");
        Customer.printInfo(c2);


        Customer c3 = new Customer("小麗");
//        System.out.println(c3.name + "是今天第: " + Customer.count + "個客戶");
        Customer.printInfo(c3);
    }
}
