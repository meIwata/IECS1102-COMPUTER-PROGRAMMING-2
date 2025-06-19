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

    }
}
