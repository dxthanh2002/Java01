/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_TreeMap;

import java.util.TreeMap;

/**
 *
 * @author admin
 */
public class Demo_treeMap2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> cart = new TreeMap();
        cart.put("SP01",2);
        cart.put("SP02",5);
        cart.put("SP03",9);
        cart.put("SP03",3);// update
        System.out.println("Hiện thị giở hàng");
        for(String masp : cart.keySet()){
            int soluong =cart.get(masp);
            System.out.println(masp +":" + soluong);
        }
        

    }
    
}
