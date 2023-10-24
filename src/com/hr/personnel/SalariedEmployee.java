package com.hr.personnel;

import java.time.LocalDate;


class SalariedEmployee extends Employee {
   private double salary;

    // Default constructor
    public SalariedEmployee() {
          this.salary = 0.0;
    }

    // Constructor that initializes superclass fields and SalariedEmployee fields
    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);  // Calls the constructor of the superclass to initialize its fields
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "[salary=" + salary + "]";
    }
}

