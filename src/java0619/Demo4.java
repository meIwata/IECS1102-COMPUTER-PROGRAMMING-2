package java0619;

public class Demo4 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "FCU";
        String s3 = "Hello";
        String s4 = new String("Hello");


        // equals()：比較字串內容。
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // false


        // ==：比較記憶體位置（參考位址）。
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // true
    }
}
