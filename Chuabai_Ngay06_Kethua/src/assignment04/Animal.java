/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Animal {
    private String name;

    public Animal() {
    }
    
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println("Xin chao, toi la dong vat, ten toi la " + this.getName());
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten con vat: ");
        this.setName(sc.nextLine());
    }
}
