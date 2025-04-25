package java_0425;

public class Test_01 {
    public static void main(String[] args) {
        int[] numbers = new int[3]; //預設有三個，但是沒有給值
        for(int i =0;i<numbers.length;i++){
            System.out.println(numbers[i]); //印出來都是0
        }
    }
}
