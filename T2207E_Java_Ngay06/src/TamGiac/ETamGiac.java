/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TamGiac;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ETamGiac extends TamGiac {
    @Override
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 canh tam giac can: ");
        a = sc.nextInt();
        
    }
    @Override
    public void display(){
        float p;
        float q;
        p = (float)(a*3);
        q =(float) ((float) a*a*(sqrt(3/4)));
        System.out.println("chu vi tam giac: " + (p));
        System.out.println("dien tich tam giac: " + (q));
    }
    
}
