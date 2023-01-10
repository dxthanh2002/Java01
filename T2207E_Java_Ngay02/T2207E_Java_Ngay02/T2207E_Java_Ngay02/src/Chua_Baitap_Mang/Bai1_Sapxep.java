package Chua_Baitap_Mang;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class Bai1_Sapxep {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner nhap = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhập phần tử " + (i+1) + ":");
            arr[i] = nhap.nextInt();
        }
        //hiển thị mảng dùng for each
        System.out.println("mảng trước khi sắp xếp:");
        for(int x : arr){
            System.out.println(x);
        }

        //thuật toán sắp xếp giảm dần kiểu chọn (selection)
        for(int i=0; i< arr.length-1;i++)//cho i chạy từ đầu đến n-1
        {
            for(int j=i+1; j<arr.length;j++)//cho j chạy từ i+1 đến n để chọn phần tử lớn hơn đổi cho i
            {
                if(arr[i] < arr[j])//nếu phần tử đứng trước nhỏ hơn thì đổi chỗ
                {
                    int tam = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tam;
                }
            }
        }
        System.out.println("Hiển thị sau khi sắp xếp giảm dần:");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}






