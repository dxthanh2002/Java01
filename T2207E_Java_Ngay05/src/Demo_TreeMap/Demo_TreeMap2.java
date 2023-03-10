/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_TreeMap;

import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class Demo_TreeMap2 {
    public static void main(String[] args) {
        //Xác định kiểu dữ liệu cụ thể cho từng phần tử
        TreeMap<String,Integer> cart = new TreeMap();
        cart.put("SP01", 2);
        cart.put("SP02", 4);
        cart.put("SP03", 5);
        cart.put("SP01", 3);//update số lượng của SP01 thành 3
        System.out.println("Hiển thị giỏ hàng:");
        for(String masp : cart.keySet())
        {
            int soluong = cart.get(masp);
            System.out.println(masp + ":" + soluong);
        }
        
        String masp = "SP04";
        boolean b = cart.containsKey(masp);
        if(b==false)
            System.out.println("Không tìm thấy " + masp);
        else
            System.out.println("Có mã sản phẩm " + masp);
    }
}
