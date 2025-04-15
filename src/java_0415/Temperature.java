package java_0415;

public class Temperature {
    float Celsius;
    float Fahrenheit;
    //F = 9/5 * C + 32，反過來C = (F - 32) * 5/9

    void celToFah() {
        Fahrenheit = (float) (9.0 / 5 * Celsius) + 32;
        System.out.println("華式: " + Fahrenheit);
    }

    void fahToCel() {
        Celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.printf("攝氏: %.2f\n", Celsius);
    }
}