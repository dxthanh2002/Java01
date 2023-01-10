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
public class Vonglap_for {
    public static void main(String[] args) {
        System.out.println("Ví dụ vòng lặp 1");
        for(int i=1; i<=5; i++)
        {
            System.out.println("vòng lặp, i = " + i);
        }
        //vòng lặp khuyết một số phần tử
        System.out.println("Ví dụ vòng lặp khuyết");
        int i=1;
        for(; ; )
        {
            if(i==6)
                break;
            System.out.println("vòng lặp, i = " + i);
            i++;
        }
         //vòng lặp khuyết một số phần tử
        System.out.println("Ví dụ vòng lặp nhiều lệnh trong biểu thức ");    
        for(int j=1, k=10; j<=k ; j++,k-- )
        { 
            System.out.println("vòng lặp, j = " + j + ", k = " + k);
            System.out.printf("vòng lặp, j = %d, k = %d\n", j,k);
        }
    }
}
