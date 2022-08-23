package com.example.kuldeep;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

class SalaryLimitException extends Exception{
    public String toString(){
        return "Salary more than 87000 is not allowed";
    }
}
class CustomExceptions extends Exception{
    public CustomExceptions(String message) {
        super(message);
    }
}
public class ExceptionHandling {
    static void check(int salary)throws SalaryLimitException{
        if(salary>87000){
            throw new SalaryLimitException();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int salary;
        String str;
        System.out.println("Enter salary");
        salary = scan.nextInt();
        System.out.println("Enter string");
        str = scan.nextLine();

//        SalaryLimit Exception
        try{
            check(salary);
        }
        catch(SalaryLimitException e){
            System.out.println(e);
        }

//        try with resources
        try(PrintStream stream = new PrintStream("Hello.txt")){
            stream.println("Hello, This is Kuldeep !");
        }
        catch (FileNotFoundException e){
            System.err.println(e);
        }
//        Conditional Exception
        try {
            Integer i;
            i = Integer.parseInt(str);
            if(i > 65000){
                throw new CustomExceptions("Invalid Elastic Search Configuration");
            }
        }
        catch(NumberFormatException | CustomExceptions cexc){
            System.out.println(cexc);
        }
    }
}
