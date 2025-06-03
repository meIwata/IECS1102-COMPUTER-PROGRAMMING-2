package java0603;

public class PokemonUtil {
    public static final int MAX_LEVEL = 20;
    public static final int MAX_CANDY = 100;

    public static String getType() {
        int type = (int) (Math.random() * 3);
        switch (type) {
            case 0:
                return "Fire";

            case 1:
                return "Water";
            default:
                return "Grass";
        }
    }

    public static int getLevel() {
        int level = (int) (Math.random() * MAX_LEVEL) + 1; // 0~19 => +1 => 1~20
        return level;
    }

    public static int getCandy() {
        int candy = (int) (Math.random() * MAX_CANDY + 1); // 0~99 => 加1在裡面 => 0~100
        return candy;
    }


    public static void main(String[] args) {
        System.out.println(PokemonUtil.getType());
    }
}
