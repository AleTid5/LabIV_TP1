package Ejercicio1;

public class Employee {
    private final int id;
    private String name;
    private int age;
    private static int nextId = 1000;

    Employee() {
        this("Sin nombre", 99);
    }

    Employee(String name, int age) {
        this.id = Employee.setNextId();
        this.setAge(age);
        this.setName(name);
    }

    @Override
    public String toString() {
        return String.format("Empleado %s, edad: %d, legajo: %d", this.name, this.age, this.id);
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    // Devuelve lo asignado y despues suma. Para devolver ya sumado, deberia ser ++Employee.nextId
    private static int setNextId() {
        return Employee.nextId++;
    }

    static int getNextId() {
        return Employee.nextId;
    }
}
