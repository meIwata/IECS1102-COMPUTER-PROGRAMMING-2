package java0619;

public class ForLoop {
    public static void main(String[] args) {
//        for (int i = 1, j = 10; i <= 5 && j >= 5; i++, j--) {
//            System.out.println("i: " + i + ", j: " + j);
//        }



        // break: 跳出迴圈，continue: 跳到下一回合
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
//                break;
                continue;
            }
            System.out.println("Iteration " + i);
        }

    }
}
