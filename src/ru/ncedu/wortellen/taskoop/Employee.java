package ru.ncedu.wortellen.taskoop;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    public Employee(int id, String firstName,String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
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
        return firstName+" "+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return salary = salary*(100+percent)/100;
    }
    public String toString(){
        return "Employee[id="+id+",name="+firstName+" "+lastName+",salary="+salary+"]";
    }
}
