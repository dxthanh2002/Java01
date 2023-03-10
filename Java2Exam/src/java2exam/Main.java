/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2exam;


import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    
    public static int Menu(){
        int chon = 0;
        System.out.println("----Menu----");
        System.out.println("1.Them sinh vien");
        System.out.println("2.Luu sinh vien");
        System.out.println("3.Hien thi DSSV");
        System.out.println("4.Thoat");
        System.out.println("Chon(1-4)");
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        chon = sc.nextInt();
        
        return chon;
    }
    
    public static void main(String[] args) {
        StudentList list = new StudentList();
        int chon = 0;
        do{
            chon = Menu();
            switch(chon){
            case 1:
                list.Add();
                break;
            case 2:
                list.SavetoFile();
                break;
            case 3:
                list.Read();
                break;
            case 4:
                System.out.println("Thoat!");
            default:
                System.out.println("Nhap lai (1-4)");
            }
        } while(chon!=4);
    }
}
