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
public class TamGiac {
    public int a;
    public int b;
    public int c;

    public TamGiac() {
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Canh 1: ");
        a = sc.nextInt();
        System.out.println("Canh 2: ");
        b = sc.nextInt();
        System.out.println("Canh 3: ");
        c = sc.nextInt();
    }
    public void display()
    {
        
        float p;
        float q;
        p = (float)(a+b+c)/2;
        q = (float) sqrt(p*(p - a)*(p - b)*(p - c));
        System.out.println("chu vi tam giac: " + (p*2));
        System.out.println("dien tich tam giac: " + (q));


        
    }
}
