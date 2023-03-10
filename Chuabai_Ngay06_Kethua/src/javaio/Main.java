/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Main {

    static final String FILE = "D:\\Quy\\Aptech\\Semester2\\Java\\Exercises\\Training\\randomAcessFilie.txt";
    static final int OBJ_SIZE = 26;

    public static void main(String[] args) {
        nhap();
        hienthi();
    }

    public static void nhap() {
        try {
            RandomAccessFile file = new RandomAccessFile(FILE, "rw");
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao ten: ");
            String name = sc.nextLine();
            System.out.println("Nhap vao tuoi: ");
            int tuoi = sc.nextInt();
            file.seek(file.length());
            file.writeUTF(name);
            for (int i = 0; i < 20 - name.length(); i++) {
                file.writeByte(1);
            }
            file.writeInt(tuoi);
            System.out.println(file.length());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void hienthi() {
        try {
            RandomAccessFile file = new RandomAccessFile(FILE, "rw");
            for (int i = 0; i < file.length() / OBJ_SIZE; i++) {
                String name = file.readUTF();
                System.out.println(name);
                for (int j = 0; j < 20 - name.length(); j++) {
                    file.writeByte(1);
                }   
                System.out.println(file.readInt());
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
