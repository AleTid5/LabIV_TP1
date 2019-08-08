package Ejercicio1;

public class Main {
    private static final int[] ages = {20, 43, 32, 26, 29};
    private static final String[] names = {"Alejandro", "Martin", "Gaston", "Ariel", "Juan"};

    public static void main(String[] args) {
        final int[] employeeIndexes = {0, 1, 2, 3, 4};
        Employee[] employees = new Employee[employeeIndexes.length];
        for (int i : employeeIndexes) employees[i] = Main.createEmployee(names[i], ages[i], i % 2 == 0);
        for (int i : employeeIndexes) Main.spit(employees[i]); // Es indistinto utilizar el metodo toString(), por defecto lo utiliza.
        Main.spit(String.format("El próximo ID será el %d", Employee.getNextId()));
    }

    private static Employee createEmployee(String name, int age, boolean withSetter) {
        if (withSetter) {
            Employee employee = new Employee();
            employee.setAge(age);
            employee.setName(name);
            return employee;
        }

        return new Employee(name, age);
    }

    private static void spit(Object o) {
        System.out.println(o);
    }
}
