/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_TreeMap;

import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class Demo_TreeMap1 {
    public static void main(String[] args) {
        TreeMap tudien = new TreeMap();
        tudien.put("Cat", "Con mèo");
        tudien.put("Home", "Ngôi nhà");
        tudien.put("Ball", "Quả bóng");
        //nếu thêm phần tử mới trùng key thì sẽ đè value mới lên phần tử cũ
        tudien.put("Home", "Nhà");
        int n = tudien.size();
        System.out.println("Số phần tử: " + n);//n=3
        String v = (String)tudien.get("Cat");
        System.out.println("Value của Cat là: " + v);
        //duyệt tất cả các cặp key, value của TreeMap
        //lấy tập hợp các key
        Set taphopKey = tudien.keySet();
        //lặp từng phần tử trong tập hợp (Set) các key
        System.out.println("Hiển thị các cặp Key + Value:");
        for(Object key : taphopKey)
        {
            Object value = tudien.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
