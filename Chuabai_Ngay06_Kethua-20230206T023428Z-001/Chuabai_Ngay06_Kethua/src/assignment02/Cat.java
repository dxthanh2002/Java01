/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment02;

/**
 *
 * @author Admin
 */
public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    public void sayHello() {
        System.out.println("Meo meo, ten toi la " + this.getName());
    }
}
