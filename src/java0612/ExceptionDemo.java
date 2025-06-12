package java0612;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException，超出陣列範圍的例外
            System.out.println(numbers.length);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("超出陣列範圍了！！！");
        }

        try {
            int[] numbers2 = null;
            System.out.println(numbers2.length); // NullPointerException，空指標例外
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("變數為空值");
        }


        System.out.println("程式結束");


        int sum = add(1, 2);
        System.out.println(sum);

    }

    public static int add(int a, int b) {
        return a + b;
    }
}
