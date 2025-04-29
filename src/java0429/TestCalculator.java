package java0429;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        // ！！！重點！！！ 因為double add(int a, int b) {return a + b;} 不是靜態方法，所以必須透過new 物件來使用其方法
        System.out.println(cal.add(1, 2));

        // ！！！重點！！！ 因為static int add(int x, String y) {return x + Integer.parseInt(y);} 是靜態方法，，所以可以用Calculator類別來調用其方法
        System.out.println(Calculator.add(1,"2"));
    }
}
