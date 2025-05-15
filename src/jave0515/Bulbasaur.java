package jave0515;

public class Bulbasaur extends Pokemon{
    public Bulbasaur(String name){
        super(name, 0, Pokemon.getRandonValue(4, 6),
                Pokemon.getRandonValue(1,5),
                Pokemon.getRandonValue(1,5));
    }
    @Override
    public void increaseAttackPower() {
        if (candy >= 1) {
            candy -= 1;
            attackPower += 1;
        } else {
            System.out.println("糖果數不足");
        }
    }

    @Override
    public void increaseDefencePower() {
        if (candy >= 1) {
            candy -= 1;
            defencePower += 1;
        } else {
            System.out.println("糖果數不足");
        }
    }

    @Override
    public void levelUp() {
        super.levelUp();
    }
}
