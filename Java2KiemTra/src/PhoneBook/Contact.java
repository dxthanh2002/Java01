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
    
    public boolean ThemSo(String so, String ten){
        if(ten.equals("") || so.equals("")){
            return false;
        }
        if(db.containsValue(so)){
            return false;
        }
        db.put(so, ten);
        return true;
    }
    public void Hienthi(){
        System.out.println("Contact name       Phone Number");
        for(String so:db.keySet())
        {
            String ten = db.get(so);
            System.out.println(ten + " :                " + so);
        }
    }
    public String Tratu(String so){
        if(db.containsKey(so)==false || db.isEmpty())
        {
            return "";
        }
        return db.get(so);
    }

    public boolean Xoa(String ten){
        if(db.containsKey(ten)){
            
            db.remove(ten);
            return true;
        }    
        return false;
    }
    
    
    
    
    
}
