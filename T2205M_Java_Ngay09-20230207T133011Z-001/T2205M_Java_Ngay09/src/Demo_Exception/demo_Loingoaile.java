/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo_Exception;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class demo_Loingoaile {
    public static void main(String[] args) {
        int a,b,thuong;
        Scanner nhap = new Scanner(System.in);
        try
        {
            System.out.println("Mời nhập a:");
            a = nhap.nextInt();
            System.out.println("Mời nhập b:");
            b = nhap.nextInt();
            thuong = a/b;
            System.out.println("Thương là: " + thuong);
        }
        catch(java.util.InputMismatchException e1)
        {
            System.out.println("Lỗi nhập số");
        }
        catch(java.lang.ArithmeticException e2)
        {
            System.out.println("Lỗi chia 0");
        }
        catch(Exception e3)
        {
            System.out.println("Có lỗi xảy ra");
            System.out.println(e3.getMessage());
        }
        System.out.println("Kết thúc!!!!");
    }
   
}
