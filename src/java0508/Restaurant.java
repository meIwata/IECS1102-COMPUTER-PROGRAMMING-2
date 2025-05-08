package java0508;

public class Restaurant {
    // 多載 Overload: 方法名稱一樣，參數不一樣
//    public void offeringLunch(Person person){
//        System.out.println("歡迎光臨逢甲大學餐廳");
//        person.eat();
//    }
//    public void offeringLunch(Student student){
//        System.out.println("歡迎光臨逢甲大學餐廳");
//        student.eat();
//    }
//    public void offeringLunch(MasterStudent masterStudent){
//        System.out.println("歡迎光臨逢甲大學餐廳");
//        masterStudent.eat();
//    }

    // 透過多形 Polymorphism 只要寫一個方法就可以了。因為參數的類別已經有繼承關係，這邊只寫Person person即可
    public void offeringLunch(Person person) {
        System.out.println("歡迎光臨逢甲大學餐廳");
        person.eat(); // 傳進來的有可能是他的子孫類別
    }
}
