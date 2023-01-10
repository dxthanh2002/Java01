/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
//khai báo lớp Student để chứa các thông tin và hành động Sinh viên
public class Student {
    //khai báo các thuộc tính
    public String Hoten;
    public int Tuoi;
    //Constructor(Hàm tạo) là hàm dùng sau new để khởi tạo đối tượng (Object)
    //Constructor cho phép đặt các lệnh được tự động chạy khi 1 đối tượng được tạo ra
    //hàm tạo trùng tên lớp và phải là public và không có kiểu trả về
    public Student() {
        Hoten = "";
        Tuoi = 0;
    }
    //Overload (nạp trồng) thêm 1 hàm tạo nữa với 2 tham số
    public Student(String Hoten, int Tuoi) {
        //this là con trỏ truy cập tới các thành phần nội bộ của lớp
        this.Hoten = Hoten;
        this.Tuoi = Tuoi;
    }
    //xây dựng các phương thức cho lớp 
    public void Display()
    {
        System.out.println("Họ tên: " + Hoten + ", Tuổi:" + Tuoi); 
    }
}
