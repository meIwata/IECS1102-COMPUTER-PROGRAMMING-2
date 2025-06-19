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

        // 字串格式化（String Formatting）
        String formattedString = String.format("Hello, %s. You are %d years old.", "John", 30);
        System.out.println(formattedString);
    }
}
