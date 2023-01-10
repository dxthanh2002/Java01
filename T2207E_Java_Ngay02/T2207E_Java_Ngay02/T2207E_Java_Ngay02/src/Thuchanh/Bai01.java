/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thuchanh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai01 {
    public static void main(String[] args) {
        String hoten;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên:");
        hoten = sc.nextLine();
        System.out.println("Hello: " + hoten);
    }
}
