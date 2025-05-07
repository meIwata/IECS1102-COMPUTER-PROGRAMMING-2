package java0507;

public class People {
    String name;
    int age;
    String gender;

    public People(){

    }

    public People(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        People tom = new People("Tom", 22, "Male"); // People{name='Tom', age=22, gender='Male'}
        People lily = new People("Lily", 30, "Female"); // People{name='Lily', age=30, gender='Female'}
        System.out.println(tom);
        System.out.println(lily);
    }

}
