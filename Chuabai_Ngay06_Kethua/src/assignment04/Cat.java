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
public class Cat extends Animal{

    public Cat() {
    }

    
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void sayHello() {
        System.out.println("Meo meo, ten toi la " + this.getName());
    }
    
    @Override
    public void nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao ten con meo: ");
    this.setName(sc.nextLine());
    }
}
