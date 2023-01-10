/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo03_Vonglap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class vidu_do_while {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        //nhập số nguyên dương n >0 và n<=100
        do{
            System.out.println("Nhập số n (1-100):");
            n = sc.nextInt();
        }while(n<=0 || n>100);
        System.out.println("Số đã nhập = " + n);
    }
}
