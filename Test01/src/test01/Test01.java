/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test01;

import Quanlysinhvien.DanhSachSinhVien;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Test01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon;
        do{
            System.out.println("----  Menu  ----");
            System.out.println("1.Thêm danh sách sinh viên");
            System.out.println("2.In ra danh sach sinh viên");
            System.out.println("3.Kiểm tra danh sách có rỗng hay không ?");
            System.out.println("4.Lấy ra số lượng sinh viên trong danh sách");
            System.out.println("5.Xóa toàn bộ, làm rỗng danh sách");
            System.out.println("6.Kiểm tra có tồn tại sinh viên đó hay không");
            System.out.println("7.Xóa 1 sinh viên");
            System.out.println("8.Tìm sinh viên dựa theo tên");
            System.out.println("9.Xuất ra sanh sách sinh viên có điểm tb từ cao đến thấp !");
            System.out.println("0. Thoát chương trình !");
            luaChon = sc.nextInt();
            
            switch (luaChon) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    break;
            }
            
            
        }while(luaChon!=4);
    }
    
}
