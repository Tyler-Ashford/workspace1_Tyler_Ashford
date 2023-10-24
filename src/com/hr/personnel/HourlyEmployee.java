package com.hr.personnel;

import java.time.LocalDate;

class HourlyEmployee extends Employee {

    private double hours;
    private double rates;

    // Constructors
    public HourlyEmployee() {
        this.hours = 0.0;
        this.rates = 0.0;
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        this.hours = 0.0;
        this.rates = 0.0;
    }

    public HourlyEmployee(String name, LocalDate hireDate, double hours, double rates) {
        super(name, hireDate);
        this.hours = hours;
        this.rates = rates;
    }

    // Getter and Setter for hours
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // Getter and Setter for rates
    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }

    // toString method
    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name='" + super.getName() + '\'' +
                ", hireDate=" + super.getHireDate() +
                ", hours=" + hours +
                ", rates=" + rates +
                '}';
    }
}
