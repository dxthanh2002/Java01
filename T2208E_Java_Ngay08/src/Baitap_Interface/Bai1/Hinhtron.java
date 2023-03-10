/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap_Interface.Bai1;

import java.util.Scanner;

public class Hinhtron implements Hinh {
    private double Bankinh;
    public Hinhtron()
    {
        Bankinh =0;
    }
    public Hinhtron(double r)
    {
        Bankinh = r;
    }
    public double getBankinh()
    {
        return Bankinh;
    }
    public void setBankinh(double r)
    {
        if(r>0)
            Bankinh=r;
        else
            Bankinh=0;
    }
    @Override
    public void Nhap()
    {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Mời nhập bán kính:");
        Bankinh = nhap.nextDouble();
    }
    @Override
    public void Hienthi()
    {
        System.out.println("Bán kình hình tròn là: " + Bankinh);
    }
    @Override
    public double Dientich()
    {
        return Math.PI*Math.pow(Bankinh, 2);
    }
    @Override
    public double Chuvi()
    {
        return 2*Math.PI*Bankinh;
    }
}
