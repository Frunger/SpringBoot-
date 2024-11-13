package cn.edu.gench.javaee.fengjingxuan2220680.spring.po;

import java.util.Date;

public class Dog {
    public Dog(){
                System.out.println("构建dog,无参数");
    }
    public Dog(String name){
                System.out.println("构建dog,一个name参数"+name);
    }
    public Dog(int age){
                System.out.println("构建dog,一个age参数"+age);
    }
private String name;
    private int age;
    private Date current;
    private String bark;
    // 构造函数
//    public Dog(int age) {
//        this.age = age;
//    }

    // name 属性的 getter 和 setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // age 属性的 getter
    public int getAge() {
        return age;
    }

    // current 属性的 getter 和 setter
    public Date getCurrent() {
        return current;
    }

    public void setCurrent(Date current) {
        this.current = current;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", current=" + current +
                ", bark='" + bark + '\'' +
                '}';
    }
}
