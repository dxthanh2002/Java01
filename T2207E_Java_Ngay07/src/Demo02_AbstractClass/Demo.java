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
public class Demo {
    public static void main(String[] args) {
        //Person là lớp abstract: không được dùng để tạo đối tượng
        //Person  p = new Person("Họ tên");
        // có thể dử dụng để tham chiếu tới các đối tượng của lớp con
        Vietnamese vi = new Vietnamese("Tuấn");
        Person p = vi;//biến p kiểu lớp cha được tham chiêu tới đối tượng lớp con
        p.display();
        p.sayHello("Hoa");
        //cho p tham tới đối tượng English
        p = new English("Peter");
        p.display();
        p.sayHello("Dũng");
    }
}
