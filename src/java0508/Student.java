package java0508;

import java.util.Date;

// 子類別 Sub class
public class Student extends Person {
//    private String id;
//    private String name;
//    private String password;
//    private String email;
//    private Date birthday;
//    private String address;
    /*以上跟class Person一樣*/

    private String studentId;
    private String school;
    private String department;

    public Student() {
        super(); // 呼叫父類別的空參數建構方法
    }

    public Student(String id, String name, String studentId) {
        super(id, name); // 把id, name參數往上丟，呼叫父類別的兩個參數id, name建構方法
//        this.id = id;
//        this.name = name;
        this.studentId = studentId;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
//    public void eat(){
//        System.out.println(name + "正要去吃東西！");
//    }
//    public void sleep(){
//        System.out.println(name + "正要去吃睡覺！");
//    }

// 第一種getName() 方法
//public void takeCourse(){
//    System.out.println(getName() + "正要去上課！");
//}
//    public void joinParty(){
//        System.out.println(getName() + "正要去派對！");
//    }


    // 第二種getName() 方法
    public void takeCourse(String name) {
        System.out.println(name + "正要去上課！");
    }

    public void joinParty(String name) {
        System.out.println(name + "正要去派對！");
    }
}