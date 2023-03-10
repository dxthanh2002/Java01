/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo06_AnonymousClass2;

/**
 *
 * @author Admin
 */
public class Test_AnonymoustClass2 {
    public static void Print(Hinh h)
    {
        h.Hienthi();
    }
    public static void main(String[] args) {
        Print(new Hinh() {
            @Override
            public void Hienthi(){
                System.out.println("Hình tròn");
            }
        });
        
        Print(new Hinh() {
            @Override
            public void Hienthi(){
                System.out.println("Hình chữ nhật");
            }
        });
    }
 
}
