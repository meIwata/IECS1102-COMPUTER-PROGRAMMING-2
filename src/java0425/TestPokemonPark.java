package java0425;

public class TestPokemonPark {
  public static void main(String[] args) {
    //int[] pokemons = new int[3]; //預設有三個，但是沒有給值，印出來都是0
    //boolean[] pokemons = new boolean[3]; //預設有三個，但是沒有給值，印出來都是false
    //String[] pokemons = new String[3]; //預設有三個，但是沒有給值，null
    Pokemon[] pokemons = new Pokemon[3]; //預設有三個，但是沒有給值，null

    //初始化
    for (int i = 0; i < pokemons.length; i++) {
      pokemons[i] = new Pokemon();
      pokemons[i].cp += i * 10;
    }

    //物件的值印出來，如果沒有初始化系統會拋出NullPointerException
    for (int i = 0; i < pokemons.length; i++) {
      System.out.println(pokemons[i].cp);
    }

    // !!! 有名字(pokemons2)的陣列 !!!
    Pokemon[] pokemons2 = {new Pokemon(), new Pokemon()};
    int[] numbers = {1, 2, 3, 4, 5};

    PokemonPark park = new PokemonPark();
     park.countPokemons(pokemons); // 寶可夢的數量: 3
     park.countPokemons(pokemons2); // 寶可夢的數量: 2

    // !!! 匿名陣列，課本8-3-5 !!!
    park.countPokemons(new Pokemon[]{new Pokemon(), new Pokemon()}); // 直接建立了一個Pokemon陣列，裡面有兩個Pokemon物件。{new Pokemon(), new Pokemon()})
    // 寶可夢的數量: 2


  }
}
