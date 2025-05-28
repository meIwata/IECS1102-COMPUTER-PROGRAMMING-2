package java0425;

// 課本案例8-17
public class Argument {
    void changePara(int x) {
        System.out.println("...方法參數 x = " + x); // 3. x = 20
        System.out.println("修改中");
        x++; // 4. x = 20+1 = 21
        System.out.println("...現在參數 x = " + x); // 5. x = 21
    }

    public static void main(String[] args) {
        Argument a = new Argument();
        int i = 20;
        System.out.println("呼叫方法前 i = " + i); // 1. i = 20
        a.changePara(i); // 2.
        System.out.println("呼叫方法後 i = " + i); // 6. i = 20
    }
}
