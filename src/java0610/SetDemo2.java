package java0610;

//class Box {
//    private Object value;
//
//    public Object getValue() {
//        return value;
//    }
//
//    public void setValue(Object value) {
//        this.value = value;
//    }
//}

//做成泛型，Box<T> 是泛型類別，可以包裝任何型別
class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


class IntegerBox {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class StringBox {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class SetDemo2 {
    public static void main(String[] args) {
//        StringBox stringBox = new StringBox();
//        stringBox.setValue("Tom");
//        System.out.println(stringBox.getValue());
//
//        IntegerBox integerBox = new IntegerBox();
//        integerBox.setValue(100);
//        System.out.println(integerBox.getValue());


        // new物件的時候指定他的型別
        Box<String> box = new Box<>();
        box.setValue("Tom");
        System.out.println(box.getValue());


        Box<Integer> box2 = new Box<>();
        box2.setValue(123);
        System.out.println(box2.getValue());

        //這樣就不需要再寫一堆 instanceof 判斷和 casting
//        Box box = new Box();
//        box.setValue("Tom");
//        box.setValue(100);
//        box.setValue(true);
//
//        Object obj = box.getValue();
//        if (obj instanceof Integer) {
//            int i = (Integer)obj;
//            System.out.println(i);
//        } else if (obj instanceof String) {
//            String s = (String)obj;
//            System.out.println(s);
//        }else if (obj instanceof Boolean) {
//            boolean b = (Boolean)obj;
//            System.out.println(b);
//        }

    }
}
