package java0422;

// 課本案例8-11
class Test {
    int x = 3;

    void show() {
        System.out.println("x = " + x);
    }
}

public class Unique {
    public static void main(String[] args) {
        Test a, b, c;
        a = new Test();
        b = new Test();

        System.out.println("a == b ?" + (a == b)); // 問的是記憶體位置相同嗎? a跟b都去new實體物件，記憶體不一樣=>false
        c = b; // c沒有new物件，取得的是b的記憶體位置
        c.x = 10; // c去改b記憶體位置裡面存的值
        System.out.println("c == b ?" + (c == b)); // 問的是記憶體位置相同嗎? true

        System.out.print("a.");
        a.show();

        System.out.print("b.");
        b.show(); // 已經被c修改值成為10了

        System.out.print("c.");
        c.show();

        // 印出物件唯一身份的代表
        System.out.println(a); // java0422.Test@5fd0d5ae
        System.out.println(b); // java0422.Test@2d98a335
        System.out.println(c); // java0422.Test@2d98a335
        // 代表b 和 c 指向同一個物件
    }
}
