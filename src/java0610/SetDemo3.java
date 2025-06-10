package java0610;

class Box2<K, V> {
    private K object1;
    private V object2;

    public K getObject1() {
        return object1;
    }

    public void setObject1(K object1) {
        this.object1 = object1;
    }

    public V getObject2() {
        return object2;
    }

    public void setObject2(V object2) {
        this.object2 = object2;
    }
}

public class SetDemo3 {
    public static void main(String[] args) {
        Box2<String, Integer> box = new Box2<String, Integer>(); //<> 裡面要不要寫都可
        box.setObject1("Mary");
        box.setObject2(1);


        String s = box.getObject1();


//        Integer i = box.getObject2();
//        int umber = i;
//        可以寫成:
        int i = box.getObject2();
    }
}
