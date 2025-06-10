package java0605;

interface Calculator {
    int add(int a, int b);
}

class MyCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class TestCalculator {
    public static void main(String[] args) {

        //匿名類別（Anonymous Class）可以用來實作介面
        Calculator calc1 = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(calc1.add(1, 2));


        // lambda語法匿名類別: 要實作的方法只有一個才能使用lambda
        Calculator calculator = (int x, int y) -> {
            System.out.print("lambda語法匿名類別 ");
            return x + y;
        };
        System.out.println(calculator.add(5, 6));

        // lambda語法匿名類別更簡潔寫法
//        Calculator calc2 = (int x, int y) -> x + y;
//        System.out.println(calc2.add(5, 6));


        // 有名稱的類別
        Calculator calc3 = new MyCalculator();
        System.out.println(calc3.add(3, 4));
    }
}
