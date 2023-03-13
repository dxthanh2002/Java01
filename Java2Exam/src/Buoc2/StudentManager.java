package Buoc2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class StudentManager {
    private ArrayList<Student> list;

    
    

    public StudentManager() {
        list = new ArrayList();
    }
    public void InputList()
    {
        Scanner sc = new Scanner(System.in);
        String res;
        while(true)
        {
            Student st = new Student();
            System.out.println("Nhập sinh viên mới:");
            st.Input();
            list.add(st);
            System.out.print("Tiếp tục? (c/k):");
            res = sc.nextLine();
            if(res.equalsIgnoreCase("k"))
                break;
        }
    }
    public void DisplayList()
    {
        if(list.isEmpty())
        { 
            System.out.println("List is empty");
            return;
        }   
        System.out.format("\n%-11s       %-25s  %-7s",
                "  EnrolID","Full Name", "Age");
        System.out.format("\n-----------  ------------------------------  -------");
        for(Student st : list)
        {
            st.Display();
        }
        
    }
    public boolean SaveToFile(String filename)
    {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(filename);
            oos = new ObjectOutputStream(fos);
            if(list.isEmpty())
            {
                System.out.println("Không có dữ liệu để ghi");
                return false;
            }
            oos.writeInt(list.size());//ghi số phần tử ra tệp
            for(Student st : list)
            {
                oos.writeObject(st);
            }
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println("Không tạo được tệp (lỗi tên tệp)");
            //Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }catch (IOException ex) {
            System.out.println("Lỗi ghi tệp");
            //Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        finally{
            try {
                    if(oos!=null)
                        oos.close();
                    if(fos!=null)
                        fos.close();
            } catch (IOException ex) {
                //Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public boolean LoadFromFile(String filename)
    {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(filename);
            ois = new ObjectInputStream(fis);
            list.clear();//xóa dữ liệu cũ
            int n = ois.readInt();//đọc số int đầu tiên của tệp
            for(int i=0;i<n;i++)
            {
                Student st = (Student)ois.readObject();
                if(st!=null)
                    list.add(st);
                else
                    break;
            }
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println("Không thấy tên tệp");
            //Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }catch (IOException ex) {
            System.out.println("Lỗi đọc tệp");
            //Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        catch (Exception ex) {
            System.out.println("Có lỗi");
            //Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        finally{
            try {
                if(ois!=null)
                    ois.close();
                if(fis!=null)
                    fis.close();
            } catch (IOException ex) {
                Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
