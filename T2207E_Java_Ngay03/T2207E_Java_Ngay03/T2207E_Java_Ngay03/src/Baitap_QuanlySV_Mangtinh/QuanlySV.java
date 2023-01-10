/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap_QuanlySV_Mangtinh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanlySV {
    int n; //số sinh viên cần nhập
    Sinhvien[] arr; //biến chứa mảng tham chiếu các sinh viên
    
    public QuanlySV() {
        n=0;
        arr = new Sinhvien[30];//tạo mảng 30 tham chiếu sinh viên
    }
    public void NhapDSSV()
    {
        Scanner sc = new Scanner(System.in);
        //Nhập n trong khoảng 1-30
        do{
            System.out.print("Nhập số sinh viên (1-30):");
            n = sc.nextInt();
        }while(n<1 || n>30);//nếu n<1 hoặc >30 thì nhập lại
        //vòng lặp nhập n sinh viên lưu vào mảng
        System.out.println("Nhập " + n + " Sinh viên:");
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhập sinh viên thứ " + (i+1) + ":");
            arr[i] = new Sinhvien();//tạo đối tượng Sinhvien gán cho phần tử thứ i
            arr[i].Nhap();
        }
    }
    public void HienthiDSSV()
    {
        for(int i=0;i<n;i++)
        {
            arr[i].Hienthi();
        }
    }
    public void SapxepDiemGiamdan()
    {
        for(int i=0; i<n-1;i++)
        {
            for(int j=i+1; j<n;j++)
            {
                Sinhvien temp;
                if(arr[i].Diem < arr[j].Diem)
                {
                    //đổi giá trị của 2 biến ở vị trí i và j trong mảng
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
