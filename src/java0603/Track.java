package java0603;

import java.util.Random;

public class Track {
    public static Car race(Car car1, Car car2) {
//        // 1. 先比最終馬力：用完加速劑後的馬力高者勝出。
//        int car1FinalHorsePower = car1.getFinalHorsePower();
//        int car2FinalHorsePower = car2.getFinalHorsePower();
//        if (car1FinalHorsePower > car2FinalHorsePower) {
//            return car1; // car1 馬力大
//        } else if (car1FinalHorsePower < car2FinalHorsePower) {
//            return car2; // car2 馬力大
//        }
//
//        // 2. 馬力相同：車款優劣排序： Sports Car > Sedan > SUV。
//        String allModel = "SUV,Sedan,Sports Car";
//        int car1ModelLevel = allModel.indexOf(car1.getModel());
//        int car2ModelLevel = allModel.indexOf(car2.getModel());
//        if (car1ModelLevel > car2ModelLevel) {
//            return car1;
//        } else if (car1ModelLevel < car2ModelLevel) {
//            return car2;
//        }
//        // 3. 若車款也相同：隨機選擇一台賽車勝出。
//        return new Random().nextBoolean() ? car1 : car2;

        if (car1.getFinalHorsePower() > car2.getFinalHorsePower()) {
            return car1;
        } else if (car1.getFinalHorsePower() < car2.getFinalHorsePower()) {
            return car2;
        } else {
            if (car1.getModel().equals("Sports Car") && car2.getModel().equals("Sedan")) {
                return car1;
            } else if (car1.getModel().equals("Sedan") && car2.getModel().equals("SUV")) {
                return car1;
            } else if (car2.getModel().equals("Sports Car") && car1.getModel().equals("Sedan")) {
                return car2;
            } else if (car2.getModel().equals("Sedan") && car1.getModel().equals("SUV")) {
                return car2;
            } else {
                int value = (int) (Math.random() * 2);
                if (value == 0) {
                    return car1;
                } else {
                    return car2;
                }
            }
        }
    }
}
