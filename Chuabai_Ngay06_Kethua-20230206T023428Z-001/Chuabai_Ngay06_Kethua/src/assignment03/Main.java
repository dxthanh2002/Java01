/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment03;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    static Zoo zoo = new Zoo();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuID;
        do {            
            menu();
            System.out.print("Menu: ");
            menuID = sc.nextInt();
            sc.nextLine();
            switch (menuID) {
                case 1:
                    them();
                    break;
                case 2:
                    xoa();
                    break;
                case 3:
                    say();
                    break;
                case 4:
                    thoat();
                    break;
                default:
                    throw new AssertionError();
            }
        } while (menuID != 4);
    }
    
    public static void menu() {
        System.out.println("----------");
        System.out.println("1. Them vao con vat");
        System.out.println("2. Xoa con vat");
        System.out.println("3. Say hello All");
        System.out.println("4. Thoat");
        System.out.println("----------");
    }

    private static void them() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten con vat: ");
        Animal a = new Animal(sc.nextLine());
        zoo.add(a);
    }

    private static void xoa() {
        if (zoo.listAnimal.isEmpty()) {
            System.err.println("Chua co con vat nao");
        } else {
            Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten con vat can xoa:  ");
        zoo.remove(sc.nextLine());
        } 
    }

    private static void say() {
        if (zoo.listAnimal.isEmpty()) {
            System.err.println("Chua co con vat nao");
        } else {
            zoo.sayHello();
        }
    }

    private static void thoat() {
        System.out.println("Ket thuc chuong trinh");
    }
}
