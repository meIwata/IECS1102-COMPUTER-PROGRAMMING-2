package java0501;

public class TestPokemon {
    public static void main(String[] args) {
        // ⚠️重點⚠️ 一般方法需透過創出實體物件去呼叫
        Pokemon one = new Pokemon();
        one.setName("皮卡丘");
        one.setCp(10);
        one.setHp(20);
        one.setCandy(50);
        System.out.println(one.toString());

//        int a = one.getCp();
//        System.out.println(a);

        // ⚠️重點⚠️ 靜態方法可以用類別做呼叫
        Pokemon.printString("Hello FCU");


    }
}
