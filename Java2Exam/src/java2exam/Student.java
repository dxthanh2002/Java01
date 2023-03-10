/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2exam;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Student {
    public String ErollID;
    public String FirstName;
    public String Lastname;
    public int Age;

    public Student() {
    }

    public Student(String ErollID, String FirstName, String Lastname, int Age) {
        this.ErollID = ErollID;
        this.FirstName = FirstName;
        this.Lastname = Lastname;
        this.Age = Age;
    }

    public String getErollID() {
        return ErollID;
    }

    public void setErollID(String ErollID) {
        this.ErollID = ErollID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    
   public void add()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ErollID:") ;
        ErollID = nhap.nextLine();
        System.out.print("Nhap ma FirstName:") ;
        FirstName = nhap.nextLine();
        System.out.print("Nhap Lastname:") ;
        Lastname = nhap.nextLine();
        System.out.print("Nhap tuoi:") ;
        Age = nhap.nextInt();
        
    }

    @Override
    public String toString() {
        return "Student{" + "ErollID=" + ErollID + ", FirstName=" + FirstName + ", Lastname=" + Lastname + ", Age=" + Age + '}';
    }
   
    
   
}
