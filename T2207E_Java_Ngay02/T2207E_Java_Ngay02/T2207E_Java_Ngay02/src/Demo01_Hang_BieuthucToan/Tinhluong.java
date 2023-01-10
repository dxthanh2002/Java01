package Demo01_Hang_BieuthucToan;

import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
//Luong = LuongCB * (heso/2);
//trong do heso: 1,2,3..,7
public class Tinhluong {
    public static void main(String[] args) {
        //tinh Luong = Lương cơ bản * (hệ số / 2)
        double LuongCB, Luong; 
        int heso; //bậc từ 1-7
        //khai báo biến sc kiểu Scanner và tạo (new) đối tượng Scanner
        //để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lương cơ bản");
        LuongCB = sc.nextDouble();//dừng màn hình đợi nhập số thực
        System.out.println("Hệ số (1-7)");
        heso = sc.nextInt();//dừng màn hình nhập số nguyên
        //Luong = LuongCB * (heso/2); //Lỗi do heso/2 kết quả là số int
        Luong = LuongCB * (heso/2.0); 
        System.out.println("Lương = " + Luong);
    }
}
