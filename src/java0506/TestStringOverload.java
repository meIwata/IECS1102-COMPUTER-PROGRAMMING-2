package java0506;

public class TestStringOverload {
    public static void main(String[] args) {
        String str1 = "Hello FCU";
        String str2 = "Hello FCU";
        String str3 = new String("Hello FCU"); /* ⚠️重點⚠️ 只要是用new就會開一個新的記憶體位置存放*/
        // 印出物件的記憶體位置（透過 identityHashCode）
        System.out.println("str1 記憶體位置: " + System.identityHashCode(str1));
        System.out.println("str2 記憶體位置: " + System.identityHashCode(str2));
        System.out.println("str3 記憶體位置: " + System.identityHashCode(str3));

        System.out.println("str1 == str2: " + (str1 == str2)); //true，當建立過的物件，會使用同一個記憶體的東西; 除非使用下面的String str2 = new String("Hello FCU"); 這樣就會再多開一個新的記憶體存放

        System.out.println("str1 == str3: " + (str1 == str3)); // false

        /*
        String str1 = new String("Hello FCU");
        String str2 = new String("Hello FCU");
        String str3 = str1;
        String str4 = new String(str1);

        // 印出物件的記憶體位置（透過 identityHashCode）
        System.out.println("str1 記憶體位置: " + System.identityHashCode(str1));
        System.out.println("str2 記憶體位置: " + System.identityHashCode(str2));
        System.out.println("str3 記憶體位置: " + System.identityHashCode(str3));
        System.out.println("str4 記憶體位置: " + System.identityHashCode(str4));

        // 比較的是記憶體的位置
        System.out.println("str1 == str2: " + (str1 == str2)); //false
        System.out.println("str1 == str3: " + (str1 == str3)); // true
        System.out.println("str1 == str4: " + (str1 == str4)); //false

        // 比較物件裡面的內容
        System.out.println("str1.equals(str2): " + (str1.equals(str2)));
        System.out.println("str1.equals(str3): " + (str1.equals(str3)));
        System.out.println("str1.equals(str4): " + (str1.equals(str4)));
        */
    }
}
