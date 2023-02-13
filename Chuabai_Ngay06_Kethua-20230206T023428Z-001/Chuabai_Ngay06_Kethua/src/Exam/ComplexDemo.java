/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

import java.util.Scanner;

public class ComplexDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.nhap(sc);
        c2.nhap(sc);
        System.out.println("Số phức thứ 1: " + c1);
        System.out.println("Số phức thứ 2: " + c2);

        Complex tong = c1.add(c2);
        System.out.print("tong hai so phuc:");
        tong.hienthi();

        Complex hieu = c1.subtract(c2);
        System.out.print("hiệu hai số phức:");
        hieu.hienthi();

        Complex tich = c1.multiply(c2);
        System.out.print("tích hai số phức:");
        tich.hienthi();

        Complex thuong = c1.divide(c2);
        System.out.print("thương hai số phức:");
        thuong.hienthi();

    }
}
