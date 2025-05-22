package java0522.animal;


//類別要加上abstract: 抽象類別裡面有抽象方法跟實作方法
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //    public void makeSound(){
//        System.out.println("動物在發出聲音");
//    }

    //    抽象方法，不能實作
    public abstract void makeSound();

    //    實作方法
    public void printInfo() {
        System.out.println(name);
    }
}
