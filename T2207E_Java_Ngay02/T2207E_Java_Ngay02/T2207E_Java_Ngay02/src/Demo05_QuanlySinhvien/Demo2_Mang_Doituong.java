/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo05_QuanlySinhvien;

/**
 *
 * @author Admin
 */
public class Demo2_Mang_Doituong {
    public static void main(String[] args) {
        int[] iarr = new int[3];//khai báo mảng 3 số nguyên
        iarr[0] = 10;
        System.out.println("iarr[0] = " + iarr[0]);
        //khai báo mảng chứa 3 sinh viên
        Sinhvien[]svArr = new Sinhvien[3];
        svArr[0] = new Sinhvien();//khởi tạo 1 Sinhvien mới gán phần tử 0
        System.out.println("Nhập sinh viên 0:");
        svArr[0].Nhap();
        System.out.println("Hiển thị sinh vien 0");
        svArr[0].Hienthi();
        
    }
}
