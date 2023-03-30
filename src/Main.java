import java.io.*;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;


public class Main
{
    public static void main(String[] args) {
        boolean again = false;
        Scanner in = new Scanner(System.in);

        Worker Tom = new Worker("Tom", "Wulf", "000001", "Prof", 1960);
        Worker Ben = new Worker("Ben", "Smith","000007","Sr.",1998);

        SalaryWorker Davin = new SalaryWorker("Davin", "Harris","000009","Jr..",1996);
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println(Tom);
        System.out.println(Tom.getFullName());
        System.out.println(Tom.getFormalName());
        System.out.println("Current age is " + Tom.getAge());
        System.out.println("Age is " + Tom.getAge(1975));
        System.out.println(Tom.toCSVRecord());
        System.out.println(Ben.calculateWeeklyPay(41));
        System.out.println(Ben.displayWeeklyPay(41));
        System.out.println(Davin.displayWeeklyPay(0));
       // System.out.println(Workers);








    }
}