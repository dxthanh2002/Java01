/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo05_AnonymousClass;

/**
 *
 * @author Admin
 */
public class Test_AnonymousClass {
    public static void main(String[] args) {
        Hinh h = new Hinh(){
            protected double Bankinh;
            @Override
            public void setData(double bk){
                this.Bankinh = bk;
            }

            @Override
            public void Hienthi() {
                System.out.println("Hình tròn");
                System.out.println("Bán kính: " + Bankinh);
            }
        };
        //sử dụng đối tượng h từ lớp vô danh
        h.setData(10);
        h.Hienthi();
    }
}
