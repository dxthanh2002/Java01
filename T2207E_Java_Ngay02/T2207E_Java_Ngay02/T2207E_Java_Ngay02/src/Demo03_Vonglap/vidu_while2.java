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
public class vidu_while2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int i=1;
        System.out.println("Ví dụ vòng lặp while");
        while(true)//vòng lặp vô tận
        {
            System.out.println("lặp i = " + i);
            System.out.println("Tiếp tục không? (C/K):");
            str = sc.nextLine();
            if(str.equalsIgnoreCase("k")) //str == k hoặc K
                break;
            i++;
        }
    }
}
