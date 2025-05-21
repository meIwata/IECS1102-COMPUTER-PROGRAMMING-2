package jave0515;

import java.util.Random;

public class Gym {
	// 傳入兩隻神起寶貝，讓其對戰
	// 贏家規則
	// 1. level高的贏
	// 2. 若level相同，則比較AttackPower - DefencePower的值
	// 3. 若2. 相同，則隨機選出一個贏家
	// 最後印出贏家的資訊

	// H.W. 用隨機的方式傳入兩隻神奇寶貝對戰

	public static void fight(Pokemon x, Pokemon y) {
		if (x.getLevel() > y.getLevel()) {
			System.out.println(x.getName() + "勝");
		} else if (x.getLevel() < y.getLevel()) {
			System.out.println(y.getName() + "勝");
		} else { // level 相同
			int xPower = x.attackPower - x.defencePower;
			int yPower = y.attackPower - y.defencePower;
			if (xPower > yPower) {
				System.out.println(x.getName() + "勝");
			} else if (xPower < yPower) {
				System.out.println(y.getName() + "勝");
			} else {
				// 隨機挑出 x 或 y
				String[] chosenArray = {x.getName(), y.getName()};
				Random random = new Random();
				int index = random.nextInt(2); // 產生一個 0 或 1 的隨機整數
				System.out.println(chosenArray[index] + "勝");

				// 老師的方法
                /*
                double random2 = Math.random(); // 0~1，不包含1
                if (random2 > 0.5) {
                    System.out.println(x.getName()+ "勝");
                }else{
                    System.out.println(y.getName() + "勝");
                }
                */
			}
		}
	}

	/*
		根據上方的規則，從多個輸入的pokemon物件中
		找出贏家，並印出贏家資訊
	*/
	public void fight(Pokemon... pokemons) {
		if (pokemons.length == 0) {
			System.out.println("沒有對戰者");
			return;
		}
		// 冒泡排序，讓最強的寶可夢冒到最後
		for (int i = 0; i < pokemons.length - 1; i++) {
			for (int j = 0; j < pokemons.length - 1 - i; j++) {
				if (compare(pokemons[j], pokemons[j + 1]) < 0) {
					// pokemons[j+1] 更強，交換
					Pokemon temp = pokemons[j];
					pokemons[j] = pokemons[j + 1];
					pokemons[j + 1] = temp;
				} else if (compare(pokemons[j], pokemons[j + 1]) == 0) {
					// 平手，隨機決定要不要換
					if (new java.util.Random().nextBoolean()) {
						Pokemon temp = pokemons[j];
						pokemons[j] = pokemons[j + 1];
						pokemons[j + 1] = temp;
					}
				}
			}
		}
		System.out.print("贏家資訊： ");
		pokemons[pokemons.length - 1].printInfo();
	}

	// 返回 -1: a弱, 1: a強, 0:平手
	private int compare(Pokemon a, Pokemon b) {
		if (a.getLevel() > b.getLevel()) return 1;
		if (a.getLevel() < b.getLevel()) return -1;
		int aPower = a.attackPower - a.defencePower;
		int bPower = b.attackPower - b.defencePower;
		if (aPower > bPower) return 1;
		if (aPower < bPower) return -1;
		return 0;
	}


	public static void main(String[] args) {
//		Pokemon[] pokemons = new Pokemon[3];
//		pokemons[0] = pickachu;
//		pokemons[1] = psyduck;
//		pokemons[2] = bulbasaur;
		Pokemon pokemon = new Pickachu("皮皮");
		Pokemon pokemon1 = new Psyduck("鴨鴨");
		Pokemon pokemon2 = new Bulbasaur("蛙蛙");

		Gym G = new Gym();
		G.fight(pokemon, pokemon1, pokemon2);



//
//		/*補充==的用法*/
//		Pokemon p1 = new Pokemon("鴨頭", 10, 15, 20, 30);
//		Pokemon p2 = new Pokemon("鴨頭", 10, 15, 20, 30);
//		System.out.println(p1 == p2); // false，因為兩個是不一樣的物件
//
//
//		Pokemon x = new Pickachu("皮卡丘");
//
//		/*可以參考Java Api: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html*/
//		String toString = x.toString(); // 使用Object的toString方法
//		System.out.println(toString); // jave0515.Pickachu@4517d9a3，這是物件的識別號碼
//
//		x.addCandy(100);
//		x.levelUp();
//		x.increaseAttackPower();
//		x.increaseDefencePower();
//
//		Pokemon y = new Bulbasaur("妙蛙種子");
//		y.addCandy(100);
//		y.levelUp();
//		y.increaseAttackPower();
//		y.increaseDefencePower();
//
//		x.printInfo();
//		y.printInfo();
//		fight(x, y);
//

	}
}
