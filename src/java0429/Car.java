package java0429;

public class Car {
    // 成員變數
    private String carNumber; // 預設值: null
    private String color; // 預設值: null
    private int doors; // 預設值: 0
    private int seats; // 預設值: 0

    Car() { // 系統預設的無參數的建構方法
        // 由開發定義初始值
        carNumber = "ABC-8888";
        color = "white";
        doors = 4;
        seats = 5;
    }

    // 有參數建構方法
    Car(String carNumber, String color, int doors, int seats) {
        this.carNumber = carNumber; // this.carNumber 指的是上面的成員變數，後面的carNumber指的是建構方法裡面的參數
        this.color = color;
        this.doors = doors;
        this.seats = seats;
    }

    Car(String carNumber, String color) {
        // 讓使用者初始化車牌、顏色
        this.carNumber = carNumber;
        this.color = color;

        // Car的開發者指定doors 4, seats 5
        doors = 4; // 這裡沒有區域變數跟他同名，可以不用this.
        seats = 5;
    }

    // 精靈產生: 右鍵 → Generate → Constructor
    Car(int doors, String color, String carNumber) {
        this.doors = doors;
        this.color = color;
        this.carNumber = carNumber;
    }

    void drive() {

    }

    void stop() {

    }

    void printCar() {
        System.out.println(carNumber + " ;" + color + " ;" + doors + " ;" + seats);
    }

    // 封裝: 課本9-10
    // getter: 取得成員變數doors的值，注意命名方法
    int getDoors() {
        return doors;
    }

    // setter: 修改成員變數doors的值
    void setDoors(int doors) { // 修改外部存取控制權: public
        if (doors > 0 && doors <= 5) {
            this.doors = doors;
            System.out.print("符合條件，讓你更改。");
        } else {
            System.out.print("不給更改，維持出廠預設值 ");
        }
    }

    // 精靈產生: 右鍵 → Generate → Getter & Setter
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        if (carNumber.length() == 8) {
            this.carNumber = carNumber;
            System.out.print("符合條件，讓你更改。");
        } else {
            System.out.print("車牌號碼有誤！不給更改。維持出廠預設值 ");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
