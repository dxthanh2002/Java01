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
public class Student extends Person{
    public double Mark;

    public Student() {
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double Mark) {
        this.Mark = Mark;
    }
    public void InputStudent()
    {
        Scanner sc = new Scanner(System.in);
        Input();//gọi Input của lớp cha Person
        System.out.println("Nhập điểm:");
        Mark = sc.nextDouble();
    }
    public void DisplayStudent()
    {
        Display();//gọi Display() của lớp cha Person
        System.out.println("Mark: " + Mark);
    }
}
