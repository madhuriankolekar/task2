
// Subclass of Employee
package com.code.oopassignment;
//Manager class name
//extends Employee class
public class Manager extends Employee {
    private double bonus;//variable bonus of type double

    // Constructor
    public Manager(String name, double salary, double bonus) {
        super(name, salary);//using super refer to Employee class variable
        this.bonus = bonus;
    }

    // Method to calculate total salary
    public double getTotalSalary() {
        return salary + bonus;
    }

    // Test in main method
    public static void main(String[] args) {
        Manager manager = new Manager("Boby ", 60000, 15000);//object of Manager,three parameter passed name,salary,bonus
        System.out.println("Manager Name: " + manager.name);//SOP to print
        System.out.println("Base Salary****: " + manager.salary);
        System.out.println("Bonus: " + manager.bonus);
        System.out.println("Total Salary: " + manager.getTotalSalary());
    }
}
