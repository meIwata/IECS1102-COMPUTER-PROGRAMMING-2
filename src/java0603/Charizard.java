package java0603;

public class Charizard extends Pokemon {
    public Charizard(String name) {
        super(name, "Fire");

    }

    @Override
    public void displayInfo() {
        System.out.println("名稱： " + getName() + '\n' +
                "屬性： " + getType() + '\n' +
                "等級： " + getLevel() + '\n' +
                "類別名稱： " + getClass().getSimpleName() + '\n' +
                "總共創建的寶可夢數量: " + getPokemonCount() + '\n'
        );
    }
}
