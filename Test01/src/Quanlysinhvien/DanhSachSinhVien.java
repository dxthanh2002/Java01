/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DanhSachSinhVien {
    public ArrayList<Sinhvien> danhsach;

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<Sinhvien>();
    }

    public DanhSachSinhVien(ArrayList<Sinhvien> danhsach) {
        this.danhsach = danhsach;
    }
    
    public void themSinhVien(){
        Scanner sc = new Scanner(System.in);
        Sinhvien sv = new Sinhvien();
        sv.Nhap();
        danhsach.add(sv);
        this.danhsach.add(sv);
    }

    
    
    
    
}
