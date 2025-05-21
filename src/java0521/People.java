package java0521;

import java.util.Objects;

public class People {
    int id;
    String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        People people = (People) obj;
        return id == people.id && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        People p1 = new People(200, "tom");
        People p2 = new People(200, "湯姆");
        People p3 = new People(350, "小王");

        System.out.print("p1與p2是否為同一人? ");
        System.out.println(p1.equals(p2));
    }
}