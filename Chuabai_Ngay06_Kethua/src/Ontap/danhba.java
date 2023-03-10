/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ontap;

import java.util.TreeMap;

/**
 *
 * @author admin
 */
public class danhba {
    TreeMap<String,String> db ;
    public danhba(){
        db = new TreeMap<String,String>();
    }
    public boolean ThemSo(String ten, String so){
        if(ten.equals("") || so.equals("")){
            return false;
        }
        if(db.containsValue(so)){//nếu từ tiếng anh đã có
            return false;
        }
        db.put(ten, so);
        return true;
    }
    public void Hienthi(){
        for(String ten:db.keySet())
        {
            String so = db.get(ten);
            System.out.println(ten + ":" + so);
        }
    }
    public String Tratu(String ten){//trả về từ tiếng Việt nếu có, không thì trả về rỗng
        if(db.containsKey(ten)==false || db.isEmpty())
        {
            return "";
        }
        return db.get(ten);
    }
    public boolean Sua(String ten, String so){
        if(db.containsKey(ten)){//Nếu từ tiếng Anh đã tồn tại
            db.put(ten, so);//thêm ta vào cột key trùng với key đã có thì value sẽ được ghi đè (tiếng Việt)
            return true;
        }
        return false;
    }
    public boolean Xoa(String ten){
        if(db.containsKey(ten)){
            
            db.remove(ten);
            return true;
        }    
        return false;
    }
    
}
