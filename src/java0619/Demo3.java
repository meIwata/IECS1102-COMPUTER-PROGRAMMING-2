package java0619;

public class Demo3 {
    public static void main(String[] args) {
        double a = 8.5;
        int b = (int) a;
        System.out.println("b = " + b); // 強制型別轉換，會直接把浮點數的小數部分捨去。

        int num = 100000;
        short num2 = (short) num;
        if (num <= 32767) {
            System.out.println("答案: " + num2);
        }

        /**
         * 將 int 型態的 num 強制轉換成 short 型態。
         * short 的範圍是 -32768 到 32767，而 100000 超出這個範圍。
         * 超過範圍時，會發生溢位（overflow），值會「繞回」到 short 型態的範圍內。
         * */

        // 字串合併（String concatenation）
        String greeting = "Hello";
//        String result = num + greeting + 2000; // 因為String result 型別是字串
        String result = num + 2000 + greeting; // 運算順序是從左到右。只要還沒遇到字串，都是用數值加法；一旦遇到字串，後面全部都會變成字串合併。
        System.out.println(result);



    }
}
