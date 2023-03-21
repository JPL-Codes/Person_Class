import java.io.*;
import java.nio.file.Files;
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

        Person Tom = new Person("Tom", "Wulf", "000001", "Prof", 1960);

        System.out.println(Tom);
        System.out.println(Tom.getFullName());
        System.out.println(Tom.getFormalName());
        System.out.println("Current age is " + Tom.getAge());
        System.out.println("Age is " + Tom.getAge(1975));
        System.out.println(Tom.toCSVRecord());



    }
}