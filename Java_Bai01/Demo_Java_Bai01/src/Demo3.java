
import Models.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Demo3 {
    public static void main(String[] args) {
       //khi sử dụng lớp ở package khác thì phải chỉ rõ đường dẫn
       Models.Student sv1 = new Models.Student();//dùng hàm tạo 0 tham số
       //tường thì import package chứa class để ngắn gon
       Student sv2 = new Student("Sinh viên 2", 20);//dùng hàm tạo 2 tham số
       //gán dữ liệu cho sv1
       sv1.Hoten = "Sinh viên 1";
       sv1.Tuoi = 19;
        System.out.println("Sinh viên 1:");
        sv1.Display();
        System.out.println("Sinh viên 2:");
        sv2.Display();
    }
}
