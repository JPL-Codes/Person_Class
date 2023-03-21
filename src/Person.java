import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class Person
{
    Scanner in = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int yob;

    File workingDirectory = new File(System.getProperty("user.dir"));
    Path file = Paths.get(workingDirectory.getPath() + "\\src\\personTestData.txt");

    static private int IDSeed = 1;


    public static void setIDSeed(int IDSeed) {Person.IDSeed = IDSeed; }
    public static int getIDSeed() {return IDSeed; }

    public Person(String firstName, String lastName, String ID, String title, int yob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.yob = yob;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setYob(int yob) {
        this.yob = yob;
    }
    public int getYob() {
        return yob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                ", title='" + title + '\'' +
                ", yob=" + yob +
                '}';
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public String getFormalName(){
        return title + " " + getFullName();
    }
    public int getAge()
    {
        return Integer.parseInt(Year.now().toString()) - yob;
    }
    public int getAge(int year)
    {
        return year - yob;
    }
    public String toCSVRecord()
    {
        return  firstName + "," + lastName+ ","+ID + ","+ title+ "," +yob;

    }

}
