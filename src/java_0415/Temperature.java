package java_0415;

public class Temperature {
    float Celsius;
    float Fahrenheit;
    //F = 9/5 * C + 32，反過來C = (F - 32) * 5/9

    // 沒有回傳值方法
    void celToFah() {
        Fahrenheit = (float) (9.0 / 5 * Celsius) + 32;
        System.out.println("華式: " + Fahrenheit);
    }

    void fahToCel() {
        Celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.printf("攝氏: %.2f\n", Celsius);
    }

    // --------------------------------------

    // 有回傳值的方法
    // 計算華氏，傳入攝氏做計算
    float Fahrenheit(float Celsius){
        return (float) (9.0 / 5 * Celsius) + 32;
    }
    // 計算攝氏，傳入華氏做計算
    float Celsius(float Fahrenheit){
        return (Fahrenheit - 32) * 5 / 9;
    }
}