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
public class Chuongtrinh {
    //hiển thị menu lựa chọn, nhập và trả về số chọn
    public static int Menu()
    {
        int chon;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- MENU -----");
        System.out.println("1.Nhập DSSV\n2.Hiển thị DSSV");
        System.out.println("3.Sắp xếp Điểm giảm dần");
        System.out.println("4.Thoát");
        System.out.println("Mời chọn (1-4):");
        chon = sc.nextInt();
        return chon;
    }
    public static void main(String[] args) {
        QuanlySV list = new QuanlySV();
        int chon;
        do{
            chon = Menu();//hiển thị Menu và trả về số chọn
            //xử lý chọn để thực hiện các yêu cầu
            switch(chon)
            {
                case 1:
                    list.NhapDSSV();
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên:");
                    list.HienthiDSSV();
                    break;
                case 3: 
                    System.out.println("Sắp xếp theo điểm giảm dần");
                    list.SapxepDiemGiamdan();
                    list.HienthiDSSV();
                    break;
                case 4:
                    System.out.println("Kết thúc!");
                    break;
                default:
                    System.out.println("Mời nhập lại từ 1-4");
            }
        }while(chon!=4);//nếu chọn ==4 thì thoát => kết thúc
    }
}
