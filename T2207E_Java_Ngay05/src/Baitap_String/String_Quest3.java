/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap_String;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class String_Quest3 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dãy số phân biệt bởi dấu chấm phẩy:");
        str = sc.nextLine();
        //tách cách các chuỗi con dựa vào dấu ;
        StringTokenizer stk = new StringTokenizer(str,";");
        //duyệt các chuỗi con đã tách
        int tongchan=0, tongle=0;
        while(stk.hasMoreTokens())
        {
            String s = stk.nextToken();
            int n = Integer.parseInt(s);//chuyển chuỗi thành số
            if(n%2==1)
                tongle += n;
            else
                tongchan +=n;
        }
        System.out.println("Tổng chẵn: " + tongchan);
        System.out.println("Tổng lẽ: " + tongle);
        System.out.println("Tổng: " + (tongchan+tongle));
    }
}
