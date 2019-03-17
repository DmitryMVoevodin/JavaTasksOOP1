package com.netcracker.MyTasks;

public class Employee {

    //Private Fields_______________________________________________________

    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    //Public Methods_______________________________________________________

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        String name = new String("");
        name += (firstName + " " + lastName);
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return (salary * 12);
    }

    //If we consider this rise like an additional sum of money
    public int raiseSalary(int percent) {
        salary += percent;
        return salary;
    }

    //If we consider this rise like a percentage growth
    public int raiseSalary2(int percent) {
        salary = (int)(salary * (percent / 100.0 + 1.0));
        return salary;
    }


    @Override
    public String toString() {
        return ("Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]");
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Employee)) return false;
        Employee another = (Employee) obj;
        return ((this.id == another.id) && (this.salary == another.salary) &&
                (this.firstName.equals(another.firstName)) && (this.lastName.equals(another.lastName)));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + salary;
        return result;
    }

}