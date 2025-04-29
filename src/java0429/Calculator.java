package java0429;

public class Calculator {
    // 方法多載 Overloading，課本8-29
    double add(int a, int b) {
        return a + b;
    }

    // 方法不同名，可以！
    double addTwoNumbers(int a, int b) {
        return a + b;
    }

    // 方法同名，參數個數不一樣，可以！
    double add(int x, int y, int z) {
        return x + y + z;
    }

    int add(int x, String y){
        return x + Integer.parseInt(y);
    }

    double add(String x, String y){
        return Double.parseDouble(x) +Double.parseDouble(y);
    }

}
