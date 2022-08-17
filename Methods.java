package com.example.kuldeep;

import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class Methods {
    static int parse(String s){
        return Integer.parseInt(s);
    }
    static void fineCalculate(String actuald, String actualm, String actualy, String returnedd,
                              String returndem, String returnedy)
    {
        String expected = "".format("%s-%s-%s",actualy,actualm,actuald);
        String returned = "".format("%s-%s-%s",returnedy,returndem,returnedd);

        LocalDate expect = LocalDate.parse(expected);
        LocalDate returns = LocalDate.parse(returned);

        long noOfDaysBetween = ChronoUnit.DAYS.between(expect, returns);

        if (parse(actualy) > parse(returnedy)) {
            System.out.println("10000 Hackos");
        } else if ((parse(returndem) > parse(actualm) && parse(returndem) <= 12) && (returnedy.equals(actualy))) {
            System.out.println("The fine = " + (500 * noOfDaysBetween));
        } else if (((parse(returnedd) > parse(actuald)) && (parse(actuald) <= 30)) && ((returndem.equals(actualm)) && (returnedy.equals(actualy)))) {
            System.out.println("The fine is = " + 15 * noOfDaysBetween);
        }
        else {
            System.out.println("No fine, Have a nice day ");
        }
    }

    public static void main(String[] args){
        String[] actuallyReturnDate;
        String[] returnedDate;
        String actualDay,actualMonth,actualYear;
        String returnDay, returnMonth, returnYear;
        Scanner scan = new Scanner(System.in);
        System.out.println("Pass from here");
        actuallyReturnDate = scan.nextLine().split(" ");
        System.out.println();
        returnedDate = scan.nextLine().split(" ");
        actualDay = actuallyReturnDate[0].length()==1?"0"+actuallyReturnDate[0]:actuallyReturnDate[0];
        actualMonth = actuallyReturnDate[1].length()==1?"0"+actuallyReturnDate[1]:actuallyReturnDate[1];
        actualYear = actuallyReturnDate[2];
        returnDay =  returnedDate[0].length()==1?"0"+returnedDate[0]:returnedDate[0];
        returnMonth =  returnedDate[1].length()==1?"0"+returnedDate[1]:returnedDate[1];
        returnYear = returnedDate[2].length()==1?"0"+returnedDate[2]:returnedDate[2];

        fineCalculate(actualDay, actualMonth, actualYear, returnDay, returnMonth, returnYear);
    }
}
