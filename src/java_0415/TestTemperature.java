package java_0415;

public class TestTemperature {
    public static void main(String[] args) {
        Temperature C = new Temperature();
        C.Celsius = 20.2f;
        C.celToFah();

        Temperature F = new Temperature();
        F.Fahrenheit = 90;
        F.fahToCel();

        System.out.println("-----------------------------------------");

        Temperature temp = new Temperature();
        System.out.println("華氏: " + temp.Fahrenheit(20.2f));
        System.out.printf("攝氏: %.2f\n", temp.Celsius(90));
    }
}