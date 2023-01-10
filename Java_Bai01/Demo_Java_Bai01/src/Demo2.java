
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

public class Demo2 {
    public static void main(String[] args) {
        String hoten;//khai báo biến kiểu chuỗi
        int tuoi; //khai báo biến kiểu số nguyên
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập họ tên:");
        hoten = sc.nextLine();//dừng màn hình đợi nhập chuỗi
        System.out.print("Nhập tuổi:");
        tuoi = sc.nextInt();//nhập số nguyên
        System.out.println("Họ tên: " + hoten);
        System.out.println("Tuổi: " + tuoi);
       
    }
}
