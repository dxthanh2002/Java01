package Baitap_Interface.Bai1;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat {
    
    public Hinhvuong()
    {
        super();
    }
    public Hinhvuong(double c)
    {
        super(c,c);
    }
    public double getCanh()
    {
        return getDai();
    }
    public void setCanh(double c)
    {
        setDai(c);
        setRong(c);
    }
    @Override
    public void Nhap(){

        double c=0;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Mời nhập cạnh:");
        c = nhap.nextDouble();
        setDai(c);
        setRong(c);
    }
    @Override
    public void Hienthi(){
        System.out.println("Cạnh của hình vuông: " + getCanh());
    }
    @Override
    public double Dientich(){
        return getCanh()*getCanh();
    }
    @Override
    public double Chuvi(){
        return getCanh()*4;
    }
}
