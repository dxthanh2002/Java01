/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Dahinh;

/**
 *
 * @author Admin
 */
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }
    @Override
    public void sayHello()
    {
        System.out.println("i'm Dog, my name:" + name);
    }
}
