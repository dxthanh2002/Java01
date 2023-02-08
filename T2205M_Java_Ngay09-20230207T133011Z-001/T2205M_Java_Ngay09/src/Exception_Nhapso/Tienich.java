/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Nhapso;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tienich {
    public static int NhapsoInt(){
        Scanner sc = new Scanner(System.in);
        int number;
        while(true)
        {
            try{
               number = Integer.parseInt(sc.nextLine());
               break;
            }
            catch(Exception e){
                System.out.println("Lỗi nhập số nguyên, mời nhập lại!");
                continue;//quay về đầu vòng lặp
            }
        }
        return number;
    }
    public static double NhapsoDouble(){
        Scanner sc = new Scanner(System.in);
        double number;
        while(true)
        {
            try{
               number = Double.parseDouble(sc.nextLine());
               break;
            }
            catch(Exception e){
                System.out.println("Lỗi nhập số thực, mời nhập lại!");
                continue;
            }
        }
        return number;
    }
}
