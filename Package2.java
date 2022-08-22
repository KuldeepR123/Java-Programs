package com.example.kuldeep.pkg2;
import com.example.kuldeep.pkg1.Method1;

public class Package2 {
    public static void main(String[] args){
        Method1 mat = new Method1();
        mat.display();
        mat.a =10;
        mat.b = 5;
        System.out.println(mat.a + mat.b);
        System.out.println(mat.a - mat.b);
        System.out.println(mat.a * mat.b);
        System.out.println(mat.a / mat.b);
    }
}
