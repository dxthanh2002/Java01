/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap_String;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class String_Quest2 {
    public static void main(String[] args) {
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi bất kỳ:");
        str1 = sc.nextLine();
        //chuyển chuỗi str1 thành dạng ký đầu mỗi từ viết hoa, còn lại chữ thường
        StringBuilder str2 = new StringBuilder(str1.toUpperCase());
        System.out.println("Chuỗi đã nhập ở dạng chữ HOA:");
        System.out.println(str2);
        //xử chuỗi dạng chữ hoa đưa về dạng mong muốn
        for(int i=1; i<str2.length();i++)//duyệt từ ký tự thứ 2 trở đi
        {
            char c = str2.charAt(i);//lấy ký tự thứ i
            char before =str2.charAt(i-1);
            //nếu đằng trước không có dấu cách
            //thì biến ký tự đó thành chữ thường và gán đè vào vị trị i
            if( before!=' ')
            {
               char c_low = Character.toLowerCase(c);
               str2.setCharAt(i, c_low);
            }
        }
        System.out.println("Kết quả sau khi biến đổi:");
        System.out.println(str2);
    }
}
