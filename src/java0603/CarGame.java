package java0603;

import java.util.Scanner;

public class CarGame {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("請輸入第一輛賽車的名稱: ");
//        String car1Name = sc.nextLine();
//        System.out.println("請輸入第二輛賽車的名稱: ");
//        String car2Name = sc.nextLine();
//
//        Car car1 = new Car(car1Name);
//        Car car2 = new Car(car2Name);
//        System.out.print("第一輛賽車: " + car1.getName() + "(" + car1.getModel() + ")");
//        System.out.println("馬力: " + car1.getHorsePower() + ", 加速劑數量: " + car1.getBoost());
//
//        System.out.print("第二輛賽車: " + car2.getName() + "(" + car2.getModel() + ")");
//        System.out.println("馬力: " + car2.getHorsePower() + ", 加速劑數量: " + car2.getBoost());
//
//        Car winner = Track.race(car1, car2);
//        System.out.println("比賽結束！");
//        System.out.println("獲勝者是: " + winner.getName() + "(" + winner.getModel() + ")" + ", 馬力: " + winner.getFinalHorsePower());


        Car car1 = null;
        Car car2 = null;
        while (true) {
            car1 = new Car("Lightning");
            car2 = new Car("Storm");
            //break;

//			if(car1.getFinalHorsePower() == car2.getFinalHorsePower()) {
//				break;
//			}

            if (car1.getFinalHorsePower() == car2.getFinalHorsePower() && car1.getModel().equals(car2.getModel())) {
                break;
            }

        }
        System.out.printf("參賽名稱:%s、車款:%s、最終馬力:%d%n",
                car1.getName(), car1.getModel(), car1.getFinalHorsePower());
        System.out.printf("參賽名稱:%s、車款:%s、最終馬力:%d%n",
                car2.getName(), car2.getModel(), car2.getFinalHorsePower());
        System.out.println("-----------------------------------------");
        Car winnerCar = Track.race(car1, car2);
        System.out.printf("勝者名稱:%s、車款:%s、最終馬力:%d%n",
                winnerCar.getName(), winnerCar.getModel(), winnerCar.getFinalHorsePower());
    }
}
