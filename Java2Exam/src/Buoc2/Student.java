package Buoc2;


import java.io.Serializable;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Student implements Serializable{
    private String EnrolID;
    private String FirstName;
    private String LastName;
    private int Age;    

    public Student() {
    }

    public Student(String EnrolID, String FirstName, String LastName, int Age) {
        this.EnrolID = EnrolID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    public String getEnrolID() {
        return EnrolID;
    }

    public void setEnrolID(String EnrolID) {
        this.EnrolID = EnrolID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("EnrollID:");
        this.EnrolID = sc.nextLine();
        System.out.print("FirtName:");
        this.FirstName = sc.nextLine();
        System.out.print("LastName:");
        this.LastName = sc.nextLine();
        System.out.print("Age:");
        this.Age = sc.nextInt();
    }
    public void Display()
    {
        System.out.format("\n%-11s       %-25s  %-7d", 
        this.EnrolID, this.LastName + " " + this.FirstName, this.Age);
    }
}
