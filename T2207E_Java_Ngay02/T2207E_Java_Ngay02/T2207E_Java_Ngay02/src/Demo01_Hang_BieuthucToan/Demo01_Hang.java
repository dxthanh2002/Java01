package Demo01_Hang_BieuthucToan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Demo01_Hang {
    public static void main(String[] args) {
        //một số qui tắc biểu diễn hằng giá trị (Literal)
        char kytu = 'A';
        String chuoi = "FPT Aptech";
        double diemtoan = 5.5;//5.5 là số thực dạng double (8 byte)
        float diemvan = 5.5f; // 5.5f hoặc 5.5F là dạng float
        float diemanh = (float)5.5;//ép kiểu (cast) từ double về float
        long n = 10L;//số nguyên dạng long (8 byte)
        int x1 = 26;//số 26 ở hệ đếm cơ số 10
        int x2 = 026;////số 26 ở hệ đếm cơ số 8
        int x3 = 0x2A;//số 2A ở hệ đếm cơ số 16
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
    }
}
