package java0501;

public class TestTemperature {
    public static void main(String[] args) {
        // 如果類別沒有靜態方法，就要new一個物件存取
//        Temperature temperature = new Temperature();


        // 使用類別的靜態方法存取
        double result = Temperature.toF(100);
        System.out.println(result);

        System.out.println(Temperature.toC(100));

    }


}
