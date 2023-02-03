/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Override;

import DemoKethua.*;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student extends Person{
    public double Mark;

    public Student() {
        super();
    }

 
    public Student(double Mark, String PCode, String Name, int Year) {
        //super(...)để gọi constructor của lớp cha 
        //lệnh siuper(...) phải đặt ở dòng đầu tiên
        super(PCode, Name, Year);
        this.Mark = Mark;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double Mark) {
        this.Mark = Mark;
    }
    //Override (ghi đè) là kỹ thuật cho phép lớp con định nghĩa lại
    //một hàm đã được kế thừa từ lớp cha
    @Override
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        //super la con trỏ để truy các thành phần kế thừa từ lớp cha
        super.Input();//gọi Input của lớp cha Person
        System.out.println("Nhập điểm:");
        Mark = sc.nextDouble();
    }
    @Override
    public void Display()
    {
        super.Display();//gọi Display() của lớp cha Person
        System.out.println("Mark: " + Mark);
    }
}
