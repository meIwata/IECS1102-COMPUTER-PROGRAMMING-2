package java0603;

import java.util.Random;

public class Gym {
    private String name;

    public Gym(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Pokemon fight(Pokemon pokemon1, Pokemon pokemon2) {
        if (pokemon1.getLevel() > pokemon2.getLevel()) {
            return pokemon1;
        } else if (pokemon1.getLevel() < pokemon2.getLevel()) {
            return pokemon2;
        }
        // 如果等級相同，則根據屬性決定勝者：
        // ◆ Fire 贏 Grass
        // ◆ Grass 贏 Water
        // ◆ Water 贏 Fire
        int pokemon1TypeInt = pokemon1.getType().equals("Grass") ? 0 : pokemon1.getType().equals("Fire") ? 1 : 2;
        int pokemon2TypeInt = pokemon2.getType().equals("Grass") ? 0 : pokemon2.getType().equals("Fire") ? 1 : 2;
        if (pokemon1TypeInt - pokemon2TypeInt == 1) {
            return pokemon1;
        } else if (pokemon1TypeInt - pokemon2TypeInt == -1) {
            return pokemon2;
        } else if (pokemon1TypeInt - pokemon2TypeInt == 2) {
            return pokemon2;
        } else if (pokemon1TypeInt - pokemon2TypeInt == -2) {
            return pokemon1;
        }
        // 如果屬性相同，則隨機選一位勝者。
        return new Random().nextBoolean() ? pokemon1 : pokemon2;
    }
}
