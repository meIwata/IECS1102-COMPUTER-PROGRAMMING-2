package java0423;

public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(name + " 在睡覺");
    }

    /*兩種顯示方法*/
    void action1(String actionName) {
        System.out.println(name + " 現在在 " + actionName);
    }

    String action2(String actionName) {
        return name + " 現在在 " + actionName;
    }

}
