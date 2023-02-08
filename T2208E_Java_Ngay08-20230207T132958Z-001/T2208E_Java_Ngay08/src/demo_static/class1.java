/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_static;

/**
 *
 * @author Tran Manh Truong
 */
public class class1 {
    int x; //instance variable
    static int y; //class variable
    private static int z;
    public class1()   {
        x=0;
    }
    public static void setZ(int n)
    {
        z = n;
    }
    public void m1() //instance method   
    {
        x++;
        y++;
    }
    public static void m2(){
        //phuong thuc tinh khong duoc phep truy cap
        //vao cac thanh phan khong static (instance variable) cua lop
        //x++;
        y++;
    }
    
}
