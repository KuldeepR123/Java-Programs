package com.example.kuldeep;
class Member{
    String name;
    int age;
    long phone_number;
    String address;
    int salary;
    Member(String name,int age,long phone_number,String address, int salary){
        this.name = name;
        this.age= age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }
}
class Employee extends Member{
    String specialization;

    Employee(String name, int age, long phone_number, String address, int salary,String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }
    void print(){
        System.out.println(name + " :"  + age + " : " + phone_number + " : " + address + " : " + salary + " : " + specialization);
    }
}
class Manager extends Member{
    String department;

    Manager(String name, int age, long phone_number, String address, int salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }
    void print(){
        System.out.println(name + " :"  + age + " : " + phone_number + " : " + address + " : " + salary + " : " + department);
    }
}
public class Inheritance {
    public static void main(String[] args){
        Employee emp = new Employee("Kuldeep",22,123456,"Rajkot",1000,"Machine Learning");
        Manager man = new Manager("KD",30,1234567,"Gujarat",20000,"Computer Science");
        emp.print();
        man.print();
    }
}
