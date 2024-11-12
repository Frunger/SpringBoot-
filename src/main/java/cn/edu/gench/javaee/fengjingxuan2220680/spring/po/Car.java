package cn.edu.gench.javaee.fengjingxuan2220680.spring.po;

public class Car {
    private String brand;
    private double price;
    private int maxSpeed; // 添加 maxSpeed 属性

    // 无参构造函数
    public Car() {}

    // 带参构造函数，用于Spring的构造函数注入
    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
