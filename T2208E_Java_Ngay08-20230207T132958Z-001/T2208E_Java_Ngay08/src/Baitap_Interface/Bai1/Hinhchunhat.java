package Baitap_Interface.Bai1;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Hinhchunhat implements Hinh {
    private double Dai,Rong;
    public Hinhchunhat()
    {
        Dai = Rong =0;
    }
    public Hinhchunhat( double d, double r)
    {
        Dai = d;
        Rong = r;
    }
    public double getDai() {
        return Dai;
    }
    public double getRong() {
        return Rong;
    }
    public void setDai(double d){
        if(d>0)
            Dai = d;
        else
            Dai =0;
    }
    public void setRong(double r){
        if(r>0)
            Rong = r;
        else
            Rong =0;
    }
    public void Nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Mời nhập chiều dài:");
        Dai = nhap.nextDouble();
        System.out.println("Mời nhập chiều rộng:");
        Rong = nhap.nextDouble();
    }
    public void Hienthi(){
        System.out.println("Dài: " + Dai + ", Rộng: " + Rong);
    }
    public double Dientich(){
        return Dai*Rong;
    }
    public double Chuvi(){
        return 2*(Dai+Rong);
    }
}
