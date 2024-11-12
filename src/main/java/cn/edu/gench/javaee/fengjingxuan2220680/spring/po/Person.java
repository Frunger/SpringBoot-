package cn.edu.gench.javaee.fengjingxuan2220680.spring.po;

public class Person {
    private String name;
    private int age;
    private Car car; // 引用类型的属性

    // 无参构造函数
    public Person() {
    }

    // 带 name 和 age 的构造函数，用于 XML 中的 person2 配置
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 带 car 的构造函数，用于 XML 中的 person3 配置
    public Person(Car car) {
        this.car = car;
    }

    // getter 和 setter 方法
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
    }
}
