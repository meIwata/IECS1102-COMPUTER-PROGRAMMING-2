package java0429;

public class TestCar {
    public static void main(String[] args) {
        Car toyota = new Car(); // 指的是Car(){}
//        System.out.println(toyota.carNumber);
//        System.out.println(toyota.doors);

        // 使用者自行輸入參數
        Car bmw = new Car("BBB-1234", "black", 5, 7);
        bmw.printCar();

        Car mini = new Car("CCC-6666", "darkgreen");
        mini.printCar();

    }

}
