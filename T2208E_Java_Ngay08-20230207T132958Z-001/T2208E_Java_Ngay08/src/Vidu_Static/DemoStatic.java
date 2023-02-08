/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vidu_Static;

/**
 *
 * @author Admin
 */
public class DemoStatic {
    int x1;
    static int x2 ;

    public DemoStatic(int x1) {
        this.x1 = x1;
    }
    public static void Test1()//hàm tĩnh
    {
        System.out.println("Test1()");
        System.out.println("biến tĩnh x2:" + x2);
        //System.out.println("Biến riêng x1 = " + x1);
        //hàm static muốn sử dụng instance member thì phải tạo object
        DemoStatic obj = new DemoStatic(10);
        obj.x1 = 30;
        obj.Test2();
    }
    //hàm không tĩnh (instance method): phải gọi từ 1 Object (instance) cụ thể
    public void Test2()//hàm không tĩnh (instance method)
    {
        System.out.println("Test2()");
        System.out.println("biến tĩnh x2:" + x2);
        System.out.println("Biến riêng x1 = " + this.x1);
    }
    public static void main(String[] args) {
        //hàm main để cùng lớp thì cũng ko cần tenlop.tenthanphantinh
        x2 = 10; //DemoStatic.x2=10;
        Test1(); //DemoStatic.Test1();
        //hàm static không được truy cập thành không static (instance member)
        //x1 = 10;
        //Test2();
        
    }
}
