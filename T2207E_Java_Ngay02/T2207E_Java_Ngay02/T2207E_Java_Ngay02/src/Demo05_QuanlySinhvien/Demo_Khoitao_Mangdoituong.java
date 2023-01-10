/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo05_QuanlySinhvien;

/**
 *
 * @author Admin
 */
public class Demo_Khoitao_Mangdoituong {
   public static void main(String[] args) {
        //khai báo mảng chứa 3 sinh viên
        Sinhvien[]svArr = new Sinhvien[3];
        //khởi tạo 3 sinh viên gán cho 3 phần tử của mảng
        for(int i=0; i<svArr.length;i++)
        {
            svArr[i] = new Sinhvien();
        }
        //nhập 3 sinh viên
        for(int i=0; i<svArr.length;i++)
        {
            System.out.println("Nhập sinh viên " + i);
            svArr[i].Nhap();
        }
        //hiển thị 3 sinh viên
        System.out.println("Hiển thị sinh vien");
        for(int i=0; i<svArr.length;i++)
        {
            svArr[i].Hienthi();
        }
        
        
    } 
}
