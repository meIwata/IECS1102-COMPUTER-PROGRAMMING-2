package java0429;

public class TestCar {
    public static void main(String[] args) {
        Car toyota = new Car(); // 指的是Car(){}
//        System.out.println(toyota.carNumber);
//        System.out.println(toyota.doors);
        System.out.println("輪胎: " + Car.wheels); // 不需要new出物件去存取wheels

        // 當輪胎wheels加上final為常數的意思，不可更變
//        Car.wheels = 10;
//        System.out.println(Car.wheels);


        // 使用者自行輸入參數
        Car bmw = new Car("BBB-1234", "black", 5, 7);
        bmw.printCar();

        Car mercedes = new Car("CCC-6666", "red");
        mercedes.printCar();

        // 使用Car預設方法再去改
        // 成員變數封裝private後 就不能直接存取資料
        Car benz = new Car();
//        benz.carNumber = "ZZZ-2222";
//        benz.color = "yellow";
        // 如果更改的條件不符合範圍，會給預設值
        benz.setDoors(2);
        System.out.println("benz的門: " + benz.getDoors());
//        benz.getCarNumber = "KKK-1100";
        benz.setCarNumber("KKK-110");
        System.out.println("benz的車牌號碼: " + benz.getCarNumber());
        benz.setSeats(4);
        System.out.println(benz.toString());
    }
}
