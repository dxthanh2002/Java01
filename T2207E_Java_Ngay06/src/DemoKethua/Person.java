/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoKethua;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Person {
    public String PCode;
    public String Name;
    public int Year;

    public Person() {
    }

    public Person(String PCode, String Name, int Year) {
        this.PCode = PCode;
        this.Name = Name;
        this.Year = Year;
    }

    public String getPCode() {
        return PCode;
    }

    public void setPCode(String PCode) {
        this.PCode = PCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Code:");
        PCode = sc.nextLine();
        System.out.println("Name:");
        Name = sc.nextLine();
        System.out.println("Year of birth:");
        Year = sc.nextInt();
    }
    public void Display()
    {
        System.out.println("Code:" + PCode + ", Name: " + Name 
                + ", Year of birth:" + Year);
    }
}
