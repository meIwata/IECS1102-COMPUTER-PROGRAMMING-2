package java0429;

public class Pokemon {
    // 成員變數如下
    // name、cp、hp、candy
    String name;
    int cp;
    int hp;
    int candy;


    // 定義建構方法 1
    // 沒有參數
    // 給定預設值 或 都不給
    Pokemon() {
        this.name = "神奇寶貝";
        this.cp = 20;
        this.hp = 10;
        this.candy = 15;
    }

    // 定義建構方法 2
    // 讓呼叫者對所有成員變數指定初始值
    Pokemon(String name, int cp, int hp, int candy) {
        this.name = name;
        this.cp = cp;
        this.hp = hp;
        this.candy = candy;
    }

    // 定義建構方法 3
    // 讓呼叫者對所有成員變數name, candy 指定初始值
    // cp: 20, hp: 100
    Pokemon(String name, int candy) {
        this.name = name;
        this.candy = candy;
        hp = 100;
        cp = 20;
    }

    // 定義一個printPokemon()方法
    // 將所有成員變數值印出
    void printPokemon() {
        System.out.println(name + " ;" + cp + " ;" + hp + " ;" + candy);
    }
}
