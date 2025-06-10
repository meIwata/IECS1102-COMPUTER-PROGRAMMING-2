package java0610;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set bag = new HashSet();
        bag.add(10);
        bag.add("Tom");
        bag.add(true);

        // 編譯會錯誤因為沒有型別
//        for(Integer number: bag){
//            System.out.println(number);
//        }
        // 放在Object型別不會報錯
//        for (Object obj : bag) {
//            System.out.println(obj);
//        }
    }
}
