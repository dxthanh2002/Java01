/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ontap01;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Danhba {
    public String name;
    public String phoneNumber;

    public Danhba() {
    }

    public Danhba(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao Ten: ");
        this.name = sc.nextLine();
        System.out.println("Nhap vao phone number:");
        this.phoneNumber= sc.nextLine();
    }
    public void hienthi(){
        System.out.println("Ten :"+ name + ",phonenumber: "+ phoneNumber );
        
    }
}
