package app;


public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Юхименко Юрій", "Менеджер", "uhemenko@gmail.com", "+3809876543", 39);
        System.out.println(emp.getFullName());
        System.out.println(emp.getPosition());
        System.out.println(emp.getEmail());
        System.out.println(emp.getPhone());
        System.out.println(emp.getAge());

        Car car = new Car();
        car.start();
    }
}


class Employee {
    private String fullName;
    private String pos;
    private String email;
    private String phone;
    private int age;

    public Employee(String fullName, String pos, String email, String phone, int age) {
        this.fullName = fullName;
        this.pos = pos;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return pos;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Запущено");
    }

    private void startElectricity() {
    }

    private void startCommand() {
    }

    private void startFuelSystem() {
    }
}