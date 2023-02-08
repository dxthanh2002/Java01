/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo02_AbstractClass;

/**
 *
 * @author sv
 */
public class English extends Person{

    public English() {
    }

    public English(String name) {
        super(name);
    }
    
    @Override
    public  void sayHello(String other)
    {
        System.out.println("Hello: " + other);
    }
}
