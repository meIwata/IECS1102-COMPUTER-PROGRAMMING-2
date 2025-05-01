package java0501;

public class TestPokemon {
    public static void main(String[] args) {
        Pokemon one = new Pokemon();
        one.setName("皮卡丘");
        one.setCp(10);
        one.setHp(20);
        one.setCandy(50);
        System.out.println(one.toString());
    }
}
