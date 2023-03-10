/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Zoo {
    List<Animal> listAnimal = new ArrayList<Animal>();
    
    public void add(Animal a) {
        listAnimal.add(a);
        System.out.println("Them con vat thanh cong!");
    }
    
    public void remove(String name) {
//        Lap thong thuong
        for (int i = 0; i < this.listAnimal.size(); i++) {
            if (this.listAnimal.get(i).getName().equalsIgnoreCase(name)) {
                Animal a = this.listAnimal.get(i);
                this.listAnimal.remove(a);
                System.err.println("Xoa thanh cong");
            }
        }

    }
    
    public void sayHello() {
        for (Animal animal : this.listAnimal) {
            animal.sayHello();
        }
    }
}
