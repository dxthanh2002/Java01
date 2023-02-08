/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Demo_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class demo_nhapso {
    public static void main(String[] args) {
        int i=0;
        Scanner nhap = new Scanner(System.in);
        boolean loi=false;
        do
        {
            try{
                System.out.println("Nhập i = ");
                i = nhap.nextInt();
                break;
            }catch( InputMismatchException e1)
            {
                System.out.println("lỗi");
                nhap.nextLine();
                loi=true;
                continue;
            }
                        
        }while(loi);
        System.out.println("i = " + i);
    }
}
