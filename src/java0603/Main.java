package java0603;

import java0603.Bulbasaur;
import java0603.Charizard;
import java0603.Pokemon;
import java0603.Psyduck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("請輸入寶可夢類別名稱（Psyduck, Charizard, Bulbasaur，或輸入 'exit' 以退出）：");
            String type = scanner.nextLine();
            if (type.equals("exit")) {
                System.out.println("已退出程式。");
                break;
            }
            System.out.print("請輸入寶可夢名稱：");
            String name = scanner.nextLine();

            Pokemon pokemon;
            if (type.equals("Psyduck")) {
                pokemon = new Psyduck(name);
            } else if (type.equals("Charizard")) {
                pokemon = new Charizard(name);
            } else if (type.equals("Bulbasaur")) {
                pokemon = new Bulbasaur(name);
            } else {
                System.out.println("輸入的寶可夢類別無效，請重新輸入。");
                continue;
            }

            //用setter方法
//            pokemon.setName(name);
            pokemon.displayInfo();

        }
        scanner.close();
    }
}