/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Triangle {

    private int edg01;
    private int edg02;
    private int edg03;

    public Triangle() {
    }

    public int getEdg01() {
        return edg01;
    }

    public void setEdg01(int edg01) {
        this.edg01 = edg01;
    }

    public int getEdg02() {
        return edg02;
    }

    public void setEdg02(int edg02) {
        this.edg02 = edg02;
    }

    public int getEdg03() {
        return edg03;
    }

    public void setEdg03(int edg03) {
        this.edg03 = edg03;
    }

    public int perimeter() {
        return (this.getEdg01() + this.getEdg02() + this.getEdg03());
    }

    public double area() {
//        Cong thuc Heron
        double p = this.perimeter() / 2.0;
        double a = this.getEdg01();
        double b = this.getEdg02();
        double c = this.getEdg03();
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return S;
    }

    public boolean checkTriangle() {
        int a = this.getEdg01();
        int b = this.getEdg02();
        int c = this.getEdg03();
        if (a + b < c || a + c < b || c + b < a) {
            return false;
        } else {
            return true;
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 3 canh cua tam giac: ");
        this.setEdg01(sc.nextInt());
        this.setEdg02(sc.nextInt());
        this.setEdg03(sc.nextInt());
    }

    public void hienthi() {
        System.out.println("3 canh cua tam giac la: " + this.getEdg01() + " - " + this.getEdg02() + " - " + this.getEdg03());
        if (this.checkTriangle()) {
            System.out.println("Chu vi la : " + this.perimeter());
            System.out.println("Dien tich la : " + this.area());
        } else {
            System.out.println("Khong phai 3 canh cua mot tam giac");
        }

    }
}
