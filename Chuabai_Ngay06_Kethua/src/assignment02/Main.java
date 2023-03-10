/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment02;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Maica");
        show(a);
        Animal d = new Dog("Hecules");
        show(d);
        Animal c = new Cat("Tom");
        show(c);
    }
    
    public static void show(Animal a) {
        a.sayHello();
    }
}
