package java_0415;

public class TestTemperature {
    public static void main(String[] args) {
        Temperature C = new Temperature();
        C.Celsius = 20.2f;
        C.celToFah();

        Temperature F = new Temperature();
        F.Fahrenheit = 90;
        F.fahToCel();
    }
}