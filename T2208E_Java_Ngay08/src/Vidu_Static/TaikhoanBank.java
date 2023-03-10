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
public class TaikhoanBank {
    public  String soTK;//instance variable
    public double soDuTK;//instance variable
    public static double laisuat;//static variable
    //khởi tạo thành phần static
    {
        laisuat = 0.8;
    }
    public TaikhoanBank() {
    }
    public TaikhoanBank(String soTK, double soDuTK) {
        this.soTK = soTK;
        this.soDuTK = soDuTK;
    }
    //instance method được phép truy câp vào static member
    public void display(){
        System.out.println("Số TK:" + this.soTK + ", Số dư:" + this.soDuTK);
        //System.out.println("Lãi suất:" + TaikhoanBank.laisuat);
        //trong cùng 1 class thì truy cập static không cần Tenlop.StaticMember
        System.out.println("Lãi suất:" + laisuat);
    }
    //static method
    public static void UpdateLaisuat(double ls)
    {
        //phương thức static không được truy cập các thành phần non-static
        //this.soTK ="ABC";
        //soDuTK =100000;
        //this.display();
        //chỉ truy cập được vào các thành phần static
        laisuat = ls;
        //TaikhoanBank.laisuat = ls;
    }
}
