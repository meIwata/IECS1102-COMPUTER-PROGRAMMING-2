package java0501;

public class Temperature {
    static double toF(int c) {
        return c * 9 / 5.0 + 32;
    }

    static double toC(int f) {
        return (f - 32) * 5 / 9.0;
    }
}
