package java0508;

public class MasterStudent extends Student{
    private String thesisName;

    public MasterStudent(String id, String name, String studentId){
        super(id, name, studentId);
    }
    public void doResearch(){
        System.out.println(getName() + "努力做研究！");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "沒時間吃飯！！！");
    }
}
