/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo02_ReNhanh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vidu_if_else {
    public static void main(String[] args) {
        //tìm max 3 số
        int a,b,c, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");  a = sc.nextInt();
        System.out.print("B = ");  b = sc.nextInt();
        System.out.print("C = ");  c = sc.nextInt();
        /*if(a>b)
            max = a;
        else
            max = b;*/
        
        max = (a>b)? a: b;
        max = (max < c)? c : max; 
        System.out.println("Max = " + max);
    }
}
