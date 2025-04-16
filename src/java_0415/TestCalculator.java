package java_0415;
class Calculator {
    int num1;
    int num2;

    // 沒有回傳值的方法
    void add() {
        int sum = num1 + num2;
        System.out.println("沒有回傳值的總和: " + sum);
    }

    // 有回傳值的方法
    int sum(int num1, int num2) {
        return num1 + num2;
    }
}

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        // 測試沒有回傳值的方法
        cal.num1 = 10;
        cal.num2 = 20;
        cal.add();

        // 測試有回傳值的方法
        int result = cal.sum(10, 20);
        System.out.println("有回傳值的總和: " + result);
    }
}

