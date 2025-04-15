package java_0415;

public class TestPokemon {
    public static void main(String[] args) {
        Pokemon duck = new Pokemon();
        duck.name = "可達鴨";
        duck.cp = 100;
        duck.hp = 200;
        duck.candy = 180;
        duck.printInfo();
        duck.powerUp();
        duck.printInfo();
        duck.evolve();
        duck.printInfo();

        System.out.println("------------------------------------------");
        Pokemon frog = new Pokemon();
        frog.name = "妙蛙種子";
        frog.cp = 50;
        frog.hp = 80;
        frog.candy = 100;
        frog.printInfo();
        frog.evolve();
        frog.printInfo();
    }
}
