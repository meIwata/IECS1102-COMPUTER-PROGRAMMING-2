package java_0425;

public class TestPokemon {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.powerUp();
        pikachu.printCpValue();

        int i = 0, j = 0;
        for (i = 0; i < 5; i++) { // 迴圈裡面的區域變數
            j = i + 1;
            System.out.println(i + ";" + j);
        }
        System.out.println(i + ";" + j);

        System.out.println("-----------------------------------");
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.println(a + ";" + b);
            }
            // System.out.println(a + ";" + b); //b不能用，因為b是巢狀迴圈裏面的區域變數
        }
    }

}
