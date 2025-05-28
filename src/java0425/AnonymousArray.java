package java0425;

public class AnonymousArray {
    void printSum(int[] nums) {
        int sum = 0;
        for(int n : nums) sum += n;
        System.out.println("總和：" + sum);
    }
    public static void main(String[] args) {
        AnonymousArray a = new AnonymousArray();
        a.printSum(new int[] {1, 2, 3, 4, 5}); // 這裡就是匿名陣列

        // 不使用匿名陣列的話，要先告儲存陣列的變數及裡面的元素
        int [] numbers = {1, 2, 3, 4, 5, 6};
        a.printSum(numbers);
    }
}
