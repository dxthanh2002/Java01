/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_test;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Hinhtron {
    public double Bankinh;

    public Hinhtron() {
        Bankinh = 0;
    }

    public Hinhtron(double r) {
        this.Bankinh = r;
    }

    public double getBankinh() {
        return Bankinh;
    }

    public void setBankinh(double r) {
        if(r>0){
            Bankinh= r;
        }else{
            Bankinh = 0;
        }
        
        
    }
    public void Nhap(){
         Scanner nhap = new Scanner(System.in);
        System.out.println("Mời nhập bán kính:");
        Bankinh = nhap.nextDouble();
    }
    
    
    
    
}
