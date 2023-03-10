/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ETriangle extends Triangle{
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh cua tam giac deu: ");
        int canh = sc.nextInt();
        this.setEdg01(canh);
        this.setEdg02(canh);
        this.setEdg03(canh);
    }
}
