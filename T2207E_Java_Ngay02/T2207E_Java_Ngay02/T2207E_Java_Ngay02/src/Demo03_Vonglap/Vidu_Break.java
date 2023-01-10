/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo03_Vonglap;

/**
 *
 * @author Admin
 */
public class Vidu_Break {
    public static void main(String[] args) {
        System.out.println("Ví dụ break");
        for(int i=1; i<=5; i++)
        {
            System.out.println("vòng lặp, i = " + i);
            if(i==3)
                break;
        }
    }
}
