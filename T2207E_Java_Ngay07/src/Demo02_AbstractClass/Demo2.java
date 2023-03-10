/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo02_AbstractClass;

import java.util.ArrayList;

/**
 *
 * @author sv
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Person> arr = new ArrayList();
        arr.add( new Vietnamese("Tuấn") );
        arr.add( new English("Peter") );
        arr.add( new Vietnamese("Dũng") );
        for(int i=0; i<arr.size();i++)
        {
            arr.get(i).display();
            //gọi sayHello() của lớp con tùy đối tượng tại vị trí i
            arr.get(i).sayHello("Java"); 
        }
    }
}
