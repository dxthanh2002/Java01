/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlysinhvien;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Sinhvien {
    public String Masv;
    public String HoTen;
    public double DiemTB;
    
    //

    public Sinhvien() {
        this.Masv="";
        this.HoTen="";
        this.DiemTB=0;
    }

    public Sinhvien(String Masv, String HoTen, double DiemTB) {
        this.Masv = Masv;
        this.HoTen = HoTen;
        this.DiemTB = DiemTB;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public double getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(double DiemTB) {
        this.DiemTB = DiemTB;
    }
    public void Nhap()//nhập thông tin từ bàn phím
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã SV:");
        this.Masv = sc.nextLine();
        System.out.print("Họ tên:");
        this.HoTen = sc.nextLine();
        System.out.print("Điểm:");
        this.DiemTB = sc.nextDouble();
        
    }
    public void Hienthi()
    {
        System.out.println("Mã SV: " + this.Masv
            + ", Họ tên:" + this.HoTen + ", Điểm;" + this.DiemTB);
    }
    
    
}
