/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ontap;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class main {
    public static int Menu(){
        int chon;
        while(true){
            try{
                Scanner nhap = new Scanner(System.in);
                System.out.println("Danh bạ"
                    + "\n1. Thêm danh bạ\n2.Hiển thị toàn bộ"
                    +"\n3.Tìm kiếm\n4.Sửa \n5.Xóa từ\n6.Thoát"
                    +"\nMời bạn chọn:");
                chon = nhap.nextInt();
                return chon;
            }
            catch (java.util.InputMismatchException e){
                System.out.println("Bạn nhập sai");
                System.out.println(e.getMessage());
                continue;
            }
        }
    }
    public static void main(String[] args) {
        int chon;
        Scanner nhap = new Scanner(System.in);
        danhba db = new danhba();
        String ten,so;
        boolean b;
        do{
            chon = Menu();
            switch(chon){
                case 1:
                    System.out.println("Nhập tên mới:");
                    ten = nhap.nextLine();
                    System.out.println("Nhập số mới:");
                    so = nhap.nextLine();
                    b =db.ThemSo(ten, so);
                    if(!b){
                        System.out.println("Lỗi thêm tên");
                    }
                    break;
                case 2:
                    System.out.println("Thông tin danh bạ:");
                    db.Hienthi();
                    break;
                case 3:
                    System.out.println("Tên người:");
                    ten = nhap.nextLine();
                    so = db.Tratu(ten);
                    if(so.equals("")){
                        System.out.println("Chưa có tên '" + ten + "'");
                    }
                    else{
                        System.out.println("Tên danh bạ có số " + so);
                    }
                    break;
                case 4:
                    System.out.println("Tên:");
                    ten = nhap.nextLine();
                    System.out.println("Số:");
                    so = nhap.nextLine();
                    b = db.Sua(ten, so);
                    if(!b){
                        System.out.println("chưa có tên: " + ten);
                    }
                    break;
                case 5:
                    System.out.println("số:");
                    ten = nhap.nextLine();
                    b = db.Xoa(ten);
                    if(!b){
                        System.out.println("chưa có tên: " + ten);
                    }
                    break;
                case 6:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        }while(chon!=6);
    }
    
}
