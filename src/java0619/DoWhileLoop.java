package java0619;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count: " + count);
            count++; // 需要加上條件控制
        } while (count <= 5);
    }
}
