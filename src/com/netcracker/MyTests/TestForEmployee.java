package com.netcracker.MyTests;

import com.netcracker.MyTasks.Employee;

public class TestForEmployee {

    public static void main(String[] args) {
        //Task 3 (Employee class)
        beginTitle(3);
            Employee eml1 = new Employee(178, "Ivan", "Gorkin", 30000);
            System.out.println("ID=" + eml1.getID() + ", FirstName=" + eml1.getFirstName() + ", LastName=" + eml1.getLastName() + ", Salary=" + eml1.getSalary());
            System.out.println(eml1.getName() + ", AnnualSalary=" + eml1.getAnnualSalary());
            eml1.setSalary(40000);
            System.out.println("After changes:");
            System.out.println(eml1.getName() + ", Salary=" + eml1.getSalary());
            eml1.raiseSalary(10000);
            System.out.println("After changes:");
            System.out.println(eml1.getName() + ", Salary=" + eml1.getSalary());
            eml1.raiseSalary2(10);
            System.out.println("After changes:");
            System.out.println(eml1.getName() + ", Salary=" + eml1.getSalary());
            System.out.println(eml1);

            System.out.println("\n Equals and HashCode:");
            Employee eml2 = new Employee(88, "Sergey", "Golisin", 30000);
            Employee eml3 = new Employee(88, "Ilya", "Golisin", 30000);
            Employee eml4 = new Employee(88, "Ilya", "Golisin", 30000);
            System.out.println("eml2: " + eml2 + ", hashcode=" + eml2.hashCode());
            System.out.println("eml3: " + eml3 + ", hashcode=" + eml3.hashCode());
            System.out.println("eml4: " + eml4 + ", hashcode=" + eml4.hashCode());
            System.out.println("eml4 equals eml3?: " + eml4.equals(eml3));
            System.out.println("eml4 == eml3?: " + (eml4 == eml3));
            System.out.println("eml3 equals eml3?: " + eml3.equals(eml3));
            System.out.println("eml3 == eml3?: " + (eml3 == eml3));
            System.out.println("eml3 equals eml2?: " + eml3.equals(eml2));
            System.out.println("eml3 == eml2?: " + (eml3 == eml2));
        endTitle();
    }

    //For some sort of design
    private static void beginTitle(int num) {
        System.out.println("******************* Task " + num + " *******************");
    }
    private static void endTitle() {
        System.out.println("**********************************************" + "\n");
    }

}