package java0501;

public class TestTemperature {
    public static void main(String[] args) {
        // 如果類別沒有靜態方法，就要new一個物件存取
//        Temperature temperature = new Temperature();


        // 使用類別的靜態方法存取
        double result = Temperature.toF(100);
        System.out.println(result);

        System.out.println(Temperature.toC(100));

        // 絕對值方法
        int absValue = Math.abs(-10);
        System.out.println(absValue);

        // 無條件捨去
        double value1 = Math.floor(5.8);
        System.out.println(value1);

        // 無條件進位
        double value2 = Math.ceil(5.8);
        System.out.println(value2);

        // 四捨五入
        double value3 = Math.round(5.8);
        System.out.println(value3);

        double value4 = Math.max(10, 2);
        System.out.println(value4);

        double value5 = Math.min(10, 2);
        System.out.println(value5);

        double value6 = Math.random()*100;
        System.out.println(value6);

    }


}
