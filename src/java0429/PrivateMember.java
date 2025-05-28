package java0429;

// 課本案例9-12
class Test {
    private int i = 1;

    // 讓程式外部可以改變 private 的成員變數，自訂的成員方法，用來修改物件的私有變數 i
    void modifyMember(int i) {
        this.i = i;
    }

    void show() {
        System.out.println("成員變數i: " + i);
    }

    // 標準 getter/setter寫法
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

public class PrivateMember {
    public static void main(String[] args) {
        Test test = new Test();
        test.show();
        test.modifyMember(2);
        test.show();
//        test.i = 30; // 私有成員變數，無法修改

        // 使用getter & setter方法去存取私有成員變數
        System.out.println("成員變數i: " + test.getI());
        test.setI(10);
        test.show();
    }
}
