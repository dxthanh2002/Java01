/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap_Mang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai_mang_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n,tongle;
        do
        {
            System.out.println("Nhập số phần tử n (1-100):");
            n = sc.nextInt();
        }while(n<1 || n>100);
        System.out.println("Số mời nhập " + n + " phần tử");
        //vòng lặp nhập n phần tử
        for(int i=0; i<n; i++)
        {
            System.out.println("Phần tử thứ " + i + ":");
            arr[i] = sc.nextInt();
        }
        //hiển thị n phần tử
        System.out.println("Các phần tử đã nhập:");
        //for(int a : arr)
        for(int i=0;i<n; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        //tính tổng số lẻ
        tongle = 0;
        for(int i=0;i<n; i++)
        {
            if(arr[i]%2!=0)
            {
                tongle+=arr[i];
            }
        }
        System.out.println("\nTổng lẻ là:" + tongle);
    }
}
