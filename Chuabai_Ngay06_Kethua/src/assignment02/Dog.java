/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment02;

/**
 *
 * @author Admin
 */
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    public void sayHello() {
        System.out.println("Gau gau, ten toi la " + this.getName());
    }
}
