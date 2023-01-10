/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Chuoi;

/**
 *
 * @author Admin
 */
public class SosanhChuoi {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "ac";
        //so sánh 2 chuỗi có phân biệt chữ hoa chữ thường
        int n = s1.compareTo(s2);
        if(n<0)
            System.out.println("s1 nhỏ hơn s2");
        else if(n==0)
            System.out.println("s1 = s2");
        else//n>0
            System.out.println("s1 lớn hơn s2");
        //so sánh chuỗi bằng hoặc khác
        boolean b = s1.equals(s2);
        if(b==true)
            System.out.println("s1 bằng s2");
        else 
            System.out.println("s1 khác s2");
    }
}
