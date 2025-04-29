package java0429;

public class TestPokemon {
    public static void main(String[] args) {
        Pokemon one = new Pokemon();
        one.printPokemon();

        Pokemon two = new Pokemon("皮卡丘", 30, 20, 35);
        two.printPokemon();

        Pokemon three = new Pokemon("妙蛙種子", 100);
        three.printPokemon();
    }
}
