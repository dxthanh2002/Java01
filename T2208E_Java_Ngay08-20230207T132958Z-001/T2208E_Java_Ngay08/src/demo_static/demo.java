/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_static;

/**
 *
 * @author Admin
 */
public class demo {
    public static void main(String[] args)
    {
        //class1.z =10;
        class1.setZ(10);
        class1 a = new class1();//tao doi tuong (instance - the hien) cua lop class1
        class1 b = new class1();
        a.x=10;        b.x=20;
        //class1.x =30;
        class1.y =30;
        b.y=40;//thay doi gia tri cung bien dung chung y, cach nay khong nen su dung, vi de gay nham lan
        System.out.println("y1 = " + class1.y + ", y2 =" + a.y );
        a.m1();
        b.m1();
        class1.m2();//m2() la phuong thuc tinh
        b.m2();//cach nay duoc phep, nhung ko nen dung
    }
}
