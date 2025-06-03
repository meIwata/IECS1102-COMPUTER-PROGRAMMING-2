package java0603;

public class Pokemon {
    private static int pokemonCount;

    private String name;
    private String type;
    private int level;
    private int candy;

    public Pokemon(String name) {
        this.name = name;
        this.type = PokemonUtil.getType();
        this.level = PokemonUtil.getLevel();
        this.candy = PokemonUtil.getCandy();
        Pokemon.pokemonCount++; // 靜態變數可以加上類別名稱
    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
        this.level = PokemonUtil.getLevel();
        this.candy = PokemonUtil.getCandy();
        Pokemon.pokemonCount++; // 靜態變數可以加上類別名稱
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getCandy() {
        return candy;
    }

    public void displayInfo() {
        System.out.println("Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                ", candy=" + candy +
                '}');
    }

    public int getPokemonCount() {
        return Pokemon.pokemonCount;
    }

    public void evolve() {
        if (candy >= 10) {
            level++;
            candy -= 10;
        } else {
            System.out.println("糖果數量不足無法升級！");
        }
    }
}
