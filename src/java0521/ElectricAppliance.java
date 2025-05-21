package java0521;
class Telephone{
    String button = "button: 0~9";
    void call(){
        System.out.println("開始打電話");
    }
}
class Mobile extends Telephone{
    String screen = "4K OLED螢幕";
}
public class ElectricAppliance {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        System.out.println(mobile.button);
        System.out.println(mobile.screen);
        mobile.call();
    }
}
