/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Dahinh;

/**
 *
 * @author Admin
 */
public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    @Override
    public void sayHello()
    {
        System.out.println("i'm Cat, my name:" + name);
    }
}
