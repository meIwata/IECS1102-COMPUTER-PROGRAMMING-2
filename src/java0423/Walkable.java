package java0423;

public interface Walkable {
    void walk();

    default void showWalkingStyle() {
        System.out.println( "我有自己的走路風格～");
    }
}
