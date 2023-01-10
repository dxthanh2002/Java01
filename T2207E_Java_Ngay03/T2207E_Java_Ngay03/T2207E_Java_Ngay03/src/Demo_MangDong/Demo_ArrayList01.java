/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_MangDong;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Demo_ArrayList01 {
    public static void main(String[] args) {
        //khai báo và khởi tạo đối tượng ArrayList 
        //là đối tượng dùng để quản lý mảng động 
        ArrayList arr = new ArrayList();
        Integer i = 10;
        Double d = 5.5;
        String str = "Java";
        Sinhvien sv = new Sinhvien("SV01", "Sinh viên 1", 9);
        //thêm các đối tượng vào mảng arr
        //không cần cùng kiểu, vì mảng sử dụng kiểu Object chung
        //Object là cha của mọi lớp trong Java
        arr.add(i);//thêm 1 đối tượng Integer vào vị trí 0
        arr.add(d);//thêm 1 đối tượng Double vào vị trí 1
        arr.add(str);//thêm 1 chuỗi vào vị trí 2
        //thêm đối tượng Sinh viên vào vị trí 2, đối tượng str sẽ lùi xuống vị trí 3
        arr.add(2, sv);
        //số phần tử mảng
        int n = arr.size();
        System.out.println("Số phần tử: " + n);
        //lấy phần tử ở vị trí số 3 (str)
        String s = (String)arr.get(3);//phải ép kiểu về kiểu ban đầu khi add
        System.out.println("arr[3] = " + s);
        Sinhvien sv2 = (Sinhvien)arr.get(2);
        sv2.Hienthi();
    }   
}
