/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_MangDong;

import Baitap_QuanlySV_Mangtinh.*;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Sinhvien {
    //khai báo các thuộc tính của lớp Sinh viên
    public String MaSV;
    public String Hoten;
    public double Diem;
    //xây dựng các hàm tạo (Constructor)
    //hàm tạo là hàm trung tên class và không kiểu trả về (không dùng void)
    //Overload (nạp chồng) 2 hàm tạo 0 tham số và 3 tham số
    public Sinhvien() {
        //System.out.println("Hello");
        this.MaSV="";
        this.Hoten="";
        this.Diem=0;
    }

    public Sinhvien(String MaSV, String Hoten, double Diem) {
        this.MaSV = MaSV;
        this.Hoten = Hoten;
        this.Diem = Diem;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }
    //xây dựng các phương thức của lớp Sinh viên
    public void Nhap()//nhập thông tin từ bàn phím
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã SV:");
        this.MaSV = sc.nextLine();
        System.out.print("Họ tên:");
        this.Hoten = sc.nextLine();
        System.out.print("Điểm:");
        this.Diem = sc.nextDouble();
    }
    public void Hienthi()
    {
        System.out.println("Mã SV: " + this.MaSV
            + ", Họ tên:" + this.Hoten + ", Điểm;" + this.Diem);
    }
    
}
