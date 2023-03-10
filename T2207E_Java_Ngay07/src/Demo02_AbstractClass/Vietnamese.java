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
//lớp con kế thừa từ abstract class thì phải 
// + ghi đè và phát triển (implement) toàn bộ các abstract method
// + hoặc lớp con phải khai báo abstract class (nếu không ghi đè đủ các abstract method)
public class Vietnamese extends Person{

    public Vietnamese() {
    }

    public Vietnamese(String name) {
        super(name);
    }
    
    @Override
    public  void sayHello(String other)
    {
        System.out.println("Xin chào: " + other);
    }
}
