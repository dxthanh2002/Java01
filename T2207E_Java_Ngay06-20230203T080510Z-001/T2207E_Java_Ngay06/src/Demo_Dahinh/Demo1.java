/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Dahinh;

/**
 *
 * @author Admin
 */
public class Demo1 {
    public static void Show(Animal a)
    {
        a.sayHello();
    }
    public static void main(String[] args) {
        Animal a = new Animal("Animal 1");
        Cat c = new Cat("Cat 1");
        Dog d = new Dog("Dog 1");
        Show(a);
        Show(c);
        Show(d);
    }
}
