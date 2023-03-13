/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhoneBook;

import java.util.HashMap;

/**
 *
 * @author admin
 */
public class Contact {
    HashMap<String, String> db ;

    public Contact() {
        db = new HashMap();
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
    public String Tratu(String ten){
        if(db.containsKey(ten)==false || db.isEmpty())
        {
            return "";
        }
        return db.get(ten);
    }

    public boolean Xoa(String ten){
        if(db.containsKey(ten)){
            
            db.remove(ten);
            return true;
        }    
        return false;
    }
    
    
    
    
    
}
