package cn.edu.gench.javaee.fengjingxuan2220680.spring.po;

public class Driver {
    private String name;
    private Address address;
    private Car car;

    public Driver() {}

    public Driver(String name, Address address, Car car) {
        this.name = name;
        this.address = address;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", car=" + car +
                '}';
    }
}
