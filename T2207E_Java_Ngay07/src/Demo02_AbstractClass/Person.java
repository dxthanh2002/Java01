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
//lớp Person chứa abstract method sayHello() nên phải khai báo abstract class
public abstract class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display()
    {
        System.out.println("My name is: " + this.name);
    }
    //khai báo phương thức trừu tượng sayHello(String other)
    //để các lớp con kế thừa bắt buộc phải ghi đè (Override)
    public abstract void sayHello(String other);
}
