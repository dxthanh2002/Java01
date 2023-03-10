/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Override;

import DemoKethua.*;

/**
 *
 * @author Admin
 */
public class Demo {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println("Nhập sinh viên 1:");
        st1.Input();
        System.out.println("Thông tin sinh viên 1:");
        st1.Display();
        Employee e1 = new Employee();
        e1.PCode = "NV01";
        e1.Name = "Nhân viên 1";
        e1.Year = 1990;
        System.out.println("Thông tin nhân viên 1:");
        e1.Display();
    }
}
