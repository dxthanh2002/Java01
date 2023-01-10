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
public class Vidumang2 {
    public static void main(String[] args) {
        int[][] a = new int[2][3];//mảng a gồm 2 dòng 3 cột số int
        //khai báo và khởi tạo mảng 2 chiều
        int[][] b = {{10,20,30}, {40,50,60}};
        for(int i=0; i <2; i++)
        {
            for(int j=0; j<3; j++)//hiển thị các phần tử của dòng i
            {
                System.out.print(b[i][j] + "\t"); 
            }
            System.out.println("");//xuống dòng trước khi tăng i
        }
    }
}
