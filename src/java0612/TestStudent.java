package java0612;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String sId;
    private String name;
    private int age;

    public Student(String sId) {
        this.sId = sId;
    }

    public Student(String sId, String name, int age) {
        this.sId = sId;
        this.name = name;
        this.age = age;
    }

    public String getsId() {
        return sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        List<Student> oopClass = new ArrayList<>();
        Student tom = new Student("S001", "Tom", 18);
        Student mary = new Student("S002", "Mary", 20);
        Student john = new Student("S003", "John", 21);

        oopClass.add(tom);
        oopClass.add(mary);
        oopClass.add(john);

        // 請從oopClass找出學號為"S002"的學生，並印出他的姓名
        // 提示：用迴圈找出符合條件的學生條件，再印出學生姓名
        for (Student student : oopClass) {
            if (student.getsId().equals("S002")) {
                System.out.println("學生的姓名: " + student.getName());
                break;
            }
        }
    }
}
