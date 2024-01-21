class Member {
    String name;
    int Age;
    long phone_number;
    String address;
    int salary;

    Member(String name, int age, long phone_number, String address, int salary) {
        this.name = name;
        this.Age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary = " + salary);
    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, long phone_number, String address, int salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    Manager(String name, int age, long phone_number, String address, int salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }
}

public class J0603Member {
    public static void main(String[] args) {
        Employee e1 = new Employee("Harsh", 20, 998877665, "paradies", 50000, "Object oriented programming");
        Manager m1 = new Manager("Sahil", 26, 98765432, "darshan university", 100000, "Web developing");

        e1.printSalary();
        m1.printSalary();
    }
}
