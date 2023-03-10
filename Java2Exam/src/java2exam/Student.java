/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2exam;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
    public String EnrolID;
    public String FirstName;
    public String LastName;
    public int Age;

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
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap EnrollID: ");
        EnrolID = sc.nextLine();
        System.out.println("Nhap FirstName ");
        FirstName = sc.nextLine();
        System.out.println("Nhap LastName");
        LastName = sc.nextLine();
        System.out.println("Nhap tuoi");
        Age = sc.nextInt();
    }
    
    @Override
    public String toString() {
        return EnrolID + "      " + FirstName + " " + LastName + "      " + Age;
    }
    
}
