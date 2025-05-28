package java0520;

class Apple{
   void printApples(String ...apples){
       // for 迴圈
       for(int i=0; i<apples.length; i++){
           System.out.println(apples[i]);
       }

       // 增強型for迴圈
//       for (String apple : apples) {
//           System.out.println(apple);
//       }
    }
}
public class VarargsDemo {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.printApples("青蘋果", "紅蘋果", "金蘋果");
        a.printApples("富士蘋果");
        a.printApples(); // 也可以不傳任何蘋果
    }
}
