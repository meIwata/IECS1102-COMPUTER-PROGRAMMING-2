package java0605;

public class Outter2 {
    // 成員變數
    private String outterName;

    // 建構子
    public Outter2(String outterName) {
        this.outterName = outterName;
    }

    public void setOutterName(String outterName) {
        this.outterName = outterName;
    }

    //  一般內部類別，可以存取外部類別的成員變數與方法
    class Inner {
        void printOutterName() {
            System.out.println("Outter Name: " + outterName);
        }

        void updateName(String name) {
            setOutterName(name);
        }
    }

    // 靜態巢狀類別，無法直接存取外部類別的非靜態成員
    static class Inner2 {
        // 一般靜態方法，只能存取自己的成員或外部類別的靜態成員
        void greeting() {
            System.out.println("Hello World...");
        }
    }

    public static void main(String[] args) {

        Outter2 outter = new Outter2("FCU"); // 建立 Outter2 物件，名稱為 "FCU"
        Outter2.Inner inner = outter.new Inner(); // 建立內部類別 Inner 的物件
        inner.printOutterName();
        inner.updateName("Hi FCU");
        inner.printOutterName();

        // 建立靜態巢狀類別 Inner2 的物件
        Outter2.Inner2 inner2 = new Outter2.Inner2();
        // 呼叫靜態巢狀類別的方法
        inner2.greeting();
    }
}
