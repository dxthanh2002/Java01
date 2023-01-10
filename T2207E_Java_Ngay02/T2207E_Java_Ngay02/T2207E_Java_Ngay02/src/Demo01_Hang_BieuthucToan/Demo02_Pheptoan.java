package Demo01_Hang_BieuthucToan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Demo02_Pheptoan {
    public static void main(String[] args) {
        System.out.println("Ví dụ Java");
        int a1 = 7/2;//a1 = 3 do 7 và 2 đều là số nguyên int
        System.out.println("giá trị a1 = " + a1);
        
        double a2 = 7/2;//a2 = 3.0 do 7 và 2 đều là số nguyên int 
        System.out.println("giá trị a2 = " + a2);//a2 = 3.5, a2=3.0 ?
        
        double a3 = 7.0/2; //7.0 là số dạng double => kết quả là số double 3.5
        System.out.println("a3 =" + a3);//a3 = 3.5, a3=3.0 ?
        
        double a4 = (double)7/2; //7.0 là số dạng double
        System.out.println("a4 =" + a4);//a4 = 3.5, a4=3.0 ?
    }
}
