package java0429;

public class Car {
    // 成員變數
    String carNumber; // 預設值: null
    String color; // 預設值: null
    int doors; // 預設值: 0
    int seats; // 預設值: 0

    Car(){ // 系統預設的無參數的建構方法
        // 由開發定義初始值
        carNumber = "ABC-8888";
        color = "white";
        doors = 4;
        seats = 5;
    }

    // 有參數建構方法
    Car(String carNumber, String color, int doors, int seats){
        this.carNumber = carNumber; // this.carNumber 指的是上面的成員變數
        this.color = color;
        this.doors = doors;
        this.seats = seats;
    }

    void drive(){

    }

    void stop(){

    }

    void printCar(){
        System.out.println(carNumber + ";" + color + ";" + doors + ";" + seats);
    }
}
