package com.example.kuldeep;
class ThisKey{
    String name;
    int salary;
    int age;
    ThisKey(String name,int salary, int age){
        this.name = name; //to differentiate instance variable and local variable
        this.salary = salary;
        this.age = age;
        this.information();
    }
    void information(){
        System.out.println(this.name + ":" + this.age + ":" + this.salary);
    }
}
class Method{
    static String name;
    static int age;
    static int salary;
    static void information(){
        System.out.println(name + ":" + age + ":" + salary);
    }
}
public class ThisKeyword {
    public static void main(String[] args){
        new ThisKey("Kuldeep",22,1000);
        Method.name  = "Kuldeep";
        Method.age = 22;
        Method.salary = 1000;
        Method.information();
    }
}
