/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Chua_Baitap_Mang;

import java.util.Scanner;

/**
 *
 * @author truongtm
 */
public class Bai7_Dem_so_chinh_phuong {
 public static void main(String[] args) {
        double[] arr = new double[100];//khai báo mảng chứa tối đa 100 số thực double
        int n; //n sẽ là số lượng phần tử thực tế được nhập
        Scanner nhap = new Scanner(System.in);//khai báo đối tượng để nhập dữ liệu từ bàn phím
        //nhập các phần tử vào mảng
        //b1. NHẬP SỐ LƯỢNG PHẦN TỬ CẦN LƯU VÀO MẢNG
        do
        {
            System.out.println("Nhập số phần tử của mảng (từ 1 đến 100):");
            n = nhap.nextInt();//dừng màn hình, đợi nhập 1 số nguyên lưu vào biến n
        }while(n<=0 || n>100);
        //b2. NHẬP N PHẦN TỪ VÀO MẢNG arr
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhập số thứ " + (i+1) +":");
            arr[i] = nhap.nextDouble();//nhập một số thực, lưu vài phần tử thứ i của mảng arr
        }
        //hiển thị các phần tử của mảng
        System.out.println("Các phần tử của mảng đã nhập là:");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
        //Đếm các số chính phương
        int dem =0;//khởi tạo biến đếm bằng 0
        for(int i=0; i<n; i++)//lặp n phần tử của mảng arr
        {
            long can;
            can = Math.round(Math.sqrt(arr[i]));//tính căn bậc 2 của phần tử cần kiểm tra và lấy phần nguyên
            if(can*can == arr[i]) //nếu lấy bình phương của căn mà bằng số ban đầu thì số đó là số chính phương
                dem++;
        }
        //kết thúc vòng lặp, in biến dem
        if(dem==0)
            System.out.println("Không có số chính phương");
        else
            System.out.println("Số lượng các số chính phương là: " + dem);
    }
}
