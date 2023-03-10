/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment03;


/**
 *
 * @author Admin
 */
public class Animal {
    private String name;
    
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
}
