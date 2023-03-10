/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class StudentList {
    ArrayList<Student> list;

    public StudentList() {
        list = new ArrayList();
    }
    
    
    public void Add(){
        Student st = new Student();
        st.Input();
        list.add(st);
    }
    
    public void Display() {
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
    
    public void SavetoFile() {
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("D:\\Students.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeInt(list.size());
            for(int i=0; i<list.size();i++)
            {
                oos.writeObject(list.get(i));
            }
            
            System.out.println("Ghi tệp thành công");
        } catch (FileNotFoundException ex) {
            System.out.println("Có lỗi mở tệp để ghi!");
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){
            System.out.println("Có lỗi!");
        }
        finally{
            try{
                fos.close();
                oos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        } 
    }
    
    public void Read() {
        ArrayList<Student> arr = new ArrayList<Student>();
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("D:\\Students.dat");
            ois = new ObjectInputStream(fis);
            int n = ois.readInt();//đọc số nguyên là số đối tượng đã ghi
            for(int i=0; i<n;i++)
            {
                Student sv = (Student)ois.readObject();//Phải ép kiểu object về kiểu object khi write
                arr.add(sv);
            }
            System.out.println("Hiển thị sinh viên:" + n);
            for(Student sv : arr)
            {
                System.out.println(sv);
            }
        } catch (FileNotFoundException ex) {
                System.out.println("Có lỗi mở tệp để đọc!");
                Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                ois.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
