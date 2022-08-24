package com.example.kuldeep;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

class SalaryLimitException extends Exception {
    public String toString() {
        return "Salary more than 87000 is not allowed";
    }
}

class CustomExceptions extends Exception {
    public CustomExceptions() {
        super("Invalid Elastic Search Configuration");
    }

    public CustomExceptions(String strMessage) {
        super(strMessage);
    }
}

public class ExceptionHandling {
    static void check(int salary) throws SalaryLimitException {
        if (salary > 87000) {
            throw new SalaryLimitException();
        }
    }

    static void checkLength(int n) throws CustomExceptions {
        if (n > 67000) {
            throw new CustomExceptions();
        }
    }

    public static void main(String[] args) throws CustomExceptions {
        Scanner scan = new Scanner(System.in);
        int salary = 67000;
        String str = "68000";

//        SalaryLimit Exception
        try {
            check(salary);
        } catch (SalaryLimitException e) {
            System.out.println(e);
        }

//        try with resources
        try (PrintStream stream = new PrintStream("Hello.txt")) {
            stream.println("Hello, This is Kuldeep !");
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
//        Conditional Exception*/
        try {
            Integer i = Integer.parseInt(str);
            checkLength(i);
        } catch (NumberFormatException nfex) {
            throw new CustomExceptions();
        }

    }
}
