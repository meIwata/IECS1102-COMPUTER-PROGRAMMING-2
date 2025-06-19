package java0619;

public class Demo2 {
    public static void main(String[] args) {
        int myAge = 15;
        int yourAge = 20;

//        int maxAge = 0;
//        if (myAge > yourAge) {
//            maxAge = myAge;
//        } else {
//            maxAge = yourAge;
//        }
//
//        System.out.println("Max age: " + maxAge);

        // 三元運算 Conditional (Ternary) Expressions
        int maxAge = (myAge > yourAge) ? myAge : yourAge;
        System.out.println("Max age: " + maxAge);

        // 陣列
        int myArray[] = {1, 2, 3, 4, 5};
        int value = myArray[3];
        System.out.println(value);

        System.out.println(yourAge / myAge); // 整數跟整數相除會得到整數
        System.out.println((double) yourAge / myAge); // 把其中一個轉成浮點數就會有小數
        System.out.println(5 + 3 * 2); // 先乘除 後加減
        System.out.println((5 + 3) * 2); // 括號優先做
    }
}
