/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Demo_Exception;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class AChiaB {
    public static void main(String[] args) {
        //demo lỗi toán học do chia cho 0 và lỗi nhập dữ liệu không phải số
        int a,b,thuong;
        Scanner nhap = new Scanner(System.in);
        try{
            System.out.println("Nhập a=");
            a = nhap.nextInt();
            System.out.println("Nhập b=");
            b = nhap.nextInt();
            thuong = a/b;
            System.out.println("thuong " + thuong);
        }catch(java.lang.ArithmeticException e1){
            System.out.println("Lõi chia cho 0");
            System.out.println("Báo lỗi có sẵn:" + e1.getMessage());
        }
        catch(java.util.InputMismatchException e2){
            System.out.println("Lỗi nhập liệu");
            System.out.println(e2.getMessage());
        }
        catch(Exception e3)
        {
            System.out.println("Lỗi khác");
        }
        finally{//đặt các lệnh luôn được chạy cho dù nhảy vào catch hay không
            System.out.println("test");
        }
    }

}
