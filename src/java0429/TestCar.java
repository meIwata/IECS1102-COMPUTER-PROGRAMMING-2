package java0429;

public class TestCar {
    public static void main(String[] args) {
        Car toyota = new Car(); // 指的是Car(){}
//        System.out.println(toyota.carNumber);
//        System.out.println(toyota.doors);

        // 使用者自行輸入參數
        Car bmw = new Car("BBB-1234", "black", 5, 7);
        bmw.printCar();

        Car mercedes = new Car("CCC-6666", "red");
        mercedes.printCar();

        // 使用Car預設方法再去改
        Car benz = new Car();
        benz.carNumber = "ZZZ-2222";
        benz.color = "yellow";
    }

}
