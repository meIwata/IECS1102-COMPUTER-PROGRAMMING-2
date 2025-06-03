package java0603;

public class CarUtil {
    public static String getRandomModel() {
        int value = (int) (Math.random() * 3); // 0, 1, 2
        switch (value) {
            case 0:
                return "Sports Car";
            case 1:
                return "Sedan";
            default:
                return "SUV";
        }
    }
    public static int getRandomHorsePower() {
        // 隨機150~200馬力
        int value = (int) (Math.random() * 51) + 150;
        return value;
    }
    public static int getRandomBoost(){
        // 隨機0~3
        int value = (int) (Math.random() * 4); // 0, 1, 2, 3
        return value;
    }

    public static void main(String[] args) {
        System.out.println(CarUtil.getRandomModel());
    }
}