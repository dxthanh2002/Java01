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
public class Dog extends Animal{

    public Dog() {
    }

    
    public Dog(String name) {
        super(name);
    }
    @Override
    public void sayHello() {
        System.out.println("Gau gau, ten toi la " + this.getName());
    }
    
    @Override
    public void nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao ten con cho: ");
    this.setName(sc.nextLine());
    }
}
