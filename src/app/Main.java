package app;

public class Main {
    public static void main(String[] args) {
        Person a1 = new Person("John", 30, "Інженер");
        Person a2 = new Person("Mary", 25, "Вчитель");
        Person a3 = new Person("Bob", 35, "Лікар");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        Person a4 = new Person("Alice", 28, "Архітектор");
        System.out.println(a4);

        a4.setProf("Дизайнер");
        System.out.println(a4);
    }
}

class Person {
    String name;
    int age;
    String prof;

    Person(String name, int age, String prof) {
        this.name = name;
        this.age = age;
        this.prof = prof;
    }

    void setProf(String newProf) {
        this.prof = newProf;
    }

    public String toString() {
        return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + prof;
    }
}