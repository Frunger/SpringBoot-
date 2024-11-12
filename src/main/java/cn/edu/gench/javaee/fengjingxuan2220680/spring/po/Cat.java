package cn.edu.gench.javaee.fengjingxuan2220680.spring.po;

import java.util.Date;

public class Cat {
    private String name;
    private int age;
    private Date current;
    private String bark;

    // 无参构造函数
    public Cat() {}

    // 带参数构造函数
    public Cat(int age) {
        this.age = age;
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

    public Date getCurrent() {
        return current;
    }

    public void setCurrent(Date current) {
        this.current = current;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", current=" + current +
                ", bark='" + bark + '\'' +
                '}';
    }
}
