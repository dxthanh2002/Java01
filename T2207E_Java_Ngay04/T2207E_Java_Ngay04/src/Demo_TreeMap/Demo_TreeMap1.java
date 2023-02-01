/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo_TreeMap;

import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class Demo_TreeMap1 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
       
        tm.put("Cat", "Con mèo");
        tm.put("Home", "Ngôi nhà");
        tm.put("Ball", "Quả bóng");
        //khi thêm 1 phần tử trùng Key đã có thì value sẽ ghi đè
        tm.put("Home", "Quê nhà");
        int n = tm.size();//số phần tử n=3
        System.out.println("Số phần tử:" + n);
        //kiểm tra key tồn tại không?
        boolean b = tm.containsKey("Home");
        if(b)
        {
            System.out.println("Home có trong Keys");
            String tv = (String)tm.get("Home");
            System.out.println("Nghĩa của Home là:" + tv);
        }
        else
            System.out.println("Home Không có trong Keys");

        //lặp và hiển thị các phần tử (key, value)
        //tm.keySet(): trả về tập hợp (Set) các phần tử ở Key cùa TreeMap
        for(Object key : tm.keySet())//lặp từng phần tử lưu vào key
        {
            String value = (String)tm.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
