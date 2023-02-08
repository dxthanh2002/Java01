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
public class Demo {
    public static void main(String[] args) {
        //các thành phần static truy cập qua TenClass.TenThanhphan
        TaikhoanBank.laisuat = 0.9;
        TaikhoanBank.UpdateLaisuat(0.8);//cập nhật lãi suất chung (class member)
        //các các thành phần không phải static thì phải tạo đối tượng (instance)
        //TaikhoanBank.soTK="TK0123"
        TaikhoanBank tkA = new TaikhoanBank("TK001", 10000000);
        TaikhoanBank tkB = new TaikhoanBank();
        tkB.soTK = "TK002";//không ảnh hưởng đến soTK cảu tkA
        tkB.soDuTK = 20000000;
        tkA.display();//hiển thị tài khoản tkA
        tkB.display();//hiển thị tài khoản tkB
    }
}
