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
public class Hinhchunhat implements Hinh {
    private double Dai,Rong;

    public Hinhchunhat() {
    }

    public Hinhchunhat(double Dai, double Rong) {
        this.Dai = 0;
        this.Rong = 0;
    }

    public double getDai() {
        return Dai;
    }

    public void setDai(double d) {
        if(d > 0){
            Dai = d;
            
        }else{
            Dai =0;
        }
    }

    public double getRong() {
        return Rong;
    }

    public void setRong(double r) {
        if(r > 0){
            Rong = r;
            
        }else{
            Rong =0;
        }
    }
    @Override
    public void Hienthi(){
        System.out.println("Dai: " +Dai+ ",Rong: " + Rong);
        
    }
    @Override
    public double Dientich(){
        return Dai*Rong;
        
    }
    @Override
    public double Chuvi(){
        return (Dai + Rong)*2.0;
    }

    @Override
    public void Nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Mời nhập chiều dài:");
        Dai = nhap.nextDouble();
        System.out.println("Mời nhập chiều rộng:");
        Rong = nhap.nextDouble();
    }
    
    
    
}
