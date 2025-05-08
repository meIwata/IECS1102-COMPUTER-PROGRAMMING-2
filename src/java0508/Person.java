package java0508;

import java.util.Date;

// 父類別 Super class
// 成員變數
public class Person {
    private String id;
    private String name;
    private String password;
    private String email;
    private Date birthday;
    private String address;

    // 空參數建構方法
    public Person() {

    }

    // 兩個參數id, name建構方法
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 每個成員變數getter & setter方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void eat(){
        System.out.println(name + "正要去吃東西！");
    }
    public void sleep(){
        System.out.println(name + "正要去吃睡覺！");
    }
}
