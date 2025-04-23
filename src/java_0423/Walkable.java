package java_0423;

public interface Walkable {
    void walk();

    default void showWalkingStyle() {
        System.out.println("我有自己的步伐風格～");
    }
}
