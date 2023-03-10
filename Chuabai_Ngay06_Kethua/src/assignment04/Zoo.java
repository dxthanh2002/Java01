/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Zoo {
    ArrayList<Animal> listAnimal = new ArrayList<Animal>();
    //tìm và trả về vị trí (0,1..) của con vật trong list có tên  = name
    //nếu không tìm thấy thì trả về -1
    private int indexOf(String name)
    {
        for (int i = 0; i < this.listAnimal.size(); i++) {
            if (this.listAnimal.get(i).getName().equalsIgnoreCase(name)) {
                return i;//trả về vị trí i tìm được
            }
        }
        //sau vòng lặp là không tìm được
        return -1;
    }
    public void add(Animal a) {
        if(indexOf(a.getName())>=0)
               System.err.println("Con vật tên: " + a.getName() + " đã tồn tại!");
        else
        {
            listAnimal.add(a);
            System.err.println("Them con vat thanh cong!");
        }
        
    }
    
    public void remove(String name) {
        int i = indexOf(name);
        if(i>=0)
        {
            this.listAnimal.remove(i);
            System.err.println("Xoa thanh cong!");
        }
        else
            System.err.println("Không tìm thấy tên cần xóa!");
    }
    
    public void sayHello() {
        for (Animal animal : this.listAnimal) {
            animal.sayHello();
        }
    }
}
