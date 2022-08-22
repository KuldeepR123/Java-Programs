package com.example.kuldeep;
import java.util.Scanner;
abstract class ArithmeticOperation{
    void perform(int x, int y){}
}
class Addition extends ArithmeticOperation{
    @Override
    void perform(int x, int y) {
        System.out.println("Addition : " + (x + y));
    }
}
class Subtraction extends ArithmeticOperation{
    @Override
    void perform(int x, int y) {
        System.out.println("Subtraction : " + (x - y));
    }
}
class Multiplication extends ArithmeticOperation{
    @Override
    void perform(int x, int y) {
        System.out.println("Multiplication : " + (x * y));
    }
}
class Division extends ArithmeticOperation{
    @Override
    void perform(int x, int y) {
        System.out.println("Division : " + (x / y));
    }
}
public class ClassObjects {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,n;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        System.out.println("Please choose the number between 1 to 4: ");
        System.out.println("1->Addition, 2->Subtraction, 3->Multiplication, 4->Division");
        n = scan.nextInt();
        if(n>4){
            throw new IllegalArgumentException(" Entered number " + n + " is greater than 4");
        }
        if(n<1){
            throw new IllegalArgumentException("Entered number " + n + " is less than 1");
        }
        Addition operation1 = new Addition();
        Subtraction operation2 = new Subtraction();
        Multiplication operation3 = new Multiplication();
        Division operation4 = new Division();
        switch(n){
            case 1 -> operation1.perform(a,b);
            case 2 -> operation2.perform(a,b);
            case 3 -> operation3.perform(a,b);
            case 4 -> operation4.perform(a,b);
        }
    }
}
