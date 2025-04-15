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

        System.out.println("--------------------");
        Pokemon fog = new Pokemon();
        fog.name = "妙蛙種子";
        fog.cp = 50;
        fog.hp = 80;
        fog.candy = 100;
        fog.printInfo();
        fog.evolve();
        fog.printInfo();
    }
}
