/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo_Loi_Ngoaile;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Demo_Phepchia {
    public static void main(String[] args) {
        int a,b,thuong;
        Scanner sc  = new Scanner(System.in);
        try{
            System.out.println("Nhập a = ");
            a = sc.nextInt();
            System.out.println("Nhập b = ");
            b = sc.nextInt();
            thuong =a/b;
            System.out.println("Thương =  " + thuong);
        }
        catch(Exception e3)
        {
            System.out.println("Có lỗi ngoại lệ");
            System.out.println(e3.getMessage());
        }
        finally//đặt các lệnh luôn thực hiện cho dù có lỗi hay không
        {
            System.out.println("Kết thúc try...catch");
        }
        System.out.println("Kết thúc!");
    }
}
