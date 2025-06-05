package java0605;

public class Outter {
    // 成員變數
    private String outterName;

    // 建構子
    public Outter(String outterName) {
        this.outterName = outterName;
    }

    public void setOutterName(String outterName) {
        this.outterName = outterName;
    }

    // 內部類別
    class Inner {
        void printOutterName() {
            System.out.println("Outter Name: " + outterName);
        }

        void updateName(String name) {
            setOutterName(name);
        }
    }

    public static void main(String[] args) {
        Outter outter = new Outter("FCU");
        Outter.Inner inner = outter.new Inner();


        inner.printOutterName();
        inner.updateName("Hi FCU");
        inner.printOutterName();
    }
}
