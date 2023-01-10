/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo04_Mangtinh;

/**
 *
 * @author Admin
 */
public class vidumang1 {
    public static void main(String[] args) {
        int[] a ;//biến a kiểu mảng int
        a = new int[10];//khởi tạo mảng chứa 10 số int ngán cho a
        //khai biến mảng b gồm 10 số int
        int[] b = new int [10];
        //khai báo mảng và khởi tạo giá trị
        float[] diem = {5.5f, 8.5f, 9.0f};//mang diem gồm 3 phần tử 5.5,8.5 và 9.0
        System.out.println("Vòng lặp for:");
        for(int i=0; i< diem.length; i++)
        {
            System.out.println(diem[i]);
        }
        System.out.println("Vòng lặp for each - tự động lặp các phần tử");
        // for(kieu_dulieu bien : bienmang){....}
        for(float d : diem)
        {
            System.out.println(d);
        }
    }
}
