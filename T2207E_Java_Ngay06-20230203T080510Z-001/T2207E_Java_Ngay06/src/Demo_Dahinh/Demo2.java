/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Dahinh;

import static Demo_Dahinh.Demo1.Show;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Demo2 {
    public static void main(String[] args) {
        //khai báo mảng kiểu dữ liệu cha thì được gán các đối tượng kiểu lớp con
        
        ArrayList<Animal> list= new ArrayList();
        
        Animal a = new Animal("Animal 1");
        Cat c = new Cat("Cat 1");
        Dog d1 = new Dog("Dog 1");
        Dog d2 = new Dog("Dog 2");
        list.add(a);
        list.add(c);
        list.add(d1);
        list.add(d2);
        System.out.println("Hiển thị các con vật");
        for(int i=0; i<list.size();i++)
        {
            list.get(i).sayHello();
        }
     }
}
