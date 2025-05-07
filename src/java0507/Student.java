package java0507;

public class Student {
    int id;
    String name;
    int chScore;
    int mathScore;
    int engScore;

    public Student(int id, String name, int chScore, int mathScore, int engScore) {
        this.id = id;
        this.name = name;
        this.chScore = chScore;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }
    public double average(){
        return (chScore + mathScore + engScore) / 3.0; // 回傳計算結果
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chScore=" + chScore +
                ", mathScore=" + mathScore +
                ", engScore=" + engScore +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "小明", 90, 85 ,70);
        Student student2 = new Student(2, "小王", 65, 50 ,73);
        Student student3 = new Student(3, "小麗", 75, 63 ,78);
        Student student4 = new Student(4, "小美", 85, 92 ,100);

        Student [] students = {student1, student2, student3,student4};

        for(Student student: students){
            System.out.println(student.toString()); // 對 student 呼叫 toString() 方法
            System.out.printf("%s的平均分數為: %.2f\n", student.name, student.average());
        }
    }
}
