package java0506;

import java.util.Scanner;

public class TestString01 {
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

        // ⚠️重點⚠️ 只要＋號的左右兩邊有一邊是字串，會把另外一個變成字串做合併
//        int num = 4;
//        String str4 = str1 + num;
//        System.out.println(str4);
        String str4 = str1 + 1 + 2 + 3;
        System.out.println(str4); // Hello FCU123，字串合併
        /*產生了 object1: Hello FCU1, object2: Hello FCU12, object1: Hello FCU123*/


//        String str4 = str1 + (1 + 2 + 3);
//        System.out.println(str4); // Hello FCU6，字串合併

        boolean flag = true;
        String str5 = str1 + flag;
        System.out.println(str5); // Hello FCUtrue


        String str6 = "Hello FCU";
        String str7 = str6.toLowerCase();
        System.out.println("str6: " + str6 + ";str7: " + str7);
        System.out.println(str6.charAt(0)); // 印出第Ｘ個字元

        // compareTo 用法
        String str8 = "aba";
        String str9 = "abc";
        System.out.println(str8.compareTo(str9)); //0

        // contains用法
        System.out.println(str1.contains("ll")); // true

        // indexOf用法
        System.out.println(str1.indexOf("o"));

        // isEmpty, isBlank用法
        str2 = "";
        str3 = "        ";
        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str3.isBlank());

        //replace用法
        String str10 = str1.replace("ll", "LL");
        System.out.println(str10);

        // substring用法
        String str11 = str1.substring(1);
        System.out.println(str11);
        String str12 = str1.substring(1, 5);
        System.out.println(str12);

        // tri用法，前後空格拿掉
        String str13 = "   ABC 123 ";
        System.out.println(str13.trim());



        // 使用者輸入一個長度大於6的字串
        // 輸入後字串處理如下
        // 每一個字元轉成小寫
        // 接著進行下列編碼
        // "a" => "4"
        // "e" => "3"
        // "l" => "1"
        // "t" => "7"
        // "s" => "5"
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入長度大於6的字串: ");

        while (true){
            String input = scanner.nextLine();
            if (input.length() < 6) {
                System.out.println("長度輸入錯誤，請重新輸入");
                continue;
            }
            else {
                String output = input.toLowerCase().replace("a", "4")
                                                    .replace("e", "3")
                                                    .replace("l", "1")
                                                    .replace("t", "7")
                                                    .replace("s", "5");
                System.out.println(output);
                break;
            }
        }


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
