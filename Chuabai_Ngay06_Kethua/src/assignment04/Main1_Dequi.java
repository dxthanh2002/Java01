/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment04;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main1_Dequi {

    static Zoo zoo = new Zoo();
//    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int menuID;
        try{
        do {
            System.out.println("----------");
            System.out.println("1. Them vao con vat");
            System.out.println("2. Xoa con vat");
            System.out.println("3. Say hello All");
            System.out.println("4. Thoat");
            System.out.println("----------");
            System.out.print("Menu: ");
            menuID = sc.nextInt();
            //sc.nextLine();
            System.out.println("Ban da chon menu :  " + menuID);
            switch (menuID) {
                case 1: {
                    them();
                    break;
                }
                case 2: {
                    xoa();
                    break;
                }
                case 3: {
                    System.out.println(menuID);
                    say();
                    break;
                }
                case 4: {
                    thoat();
                    break;
                }
                default: {
                    System.err.println("Chon tu 1 - 4");
                    menu();
                    break;
                }
            }
        } while (menuID != 4);
        } catch (Exception e) {
            System.err.println("Chon tu 1 - 4");
            menu();
        }

    }

    private static void them() {
        Scanner sc = new Scanner(System.in);
        int typeAnimal;
        System.out.println("Nhap loai dong vat muon them: ");
        System.out.println("1. Animal");
        System.out.println("2. Cho");
        System.out.println("3. Meo");
        System.out.println("4. Quay tro lai");
        try {
            typeAnimal = sc.nextInt();
            sc.nextLine();
            switch (typeAnimal) {
                case 1: 
                case 2: 
                case 3: 
                    Animal a;
                    if(typeAnimal==1)
                        a= new Animal();
                    else if(typeAnimal==2)
                        a = new Dog();
                    else
                        a = new Cat();
                    a.nhap();
                    zoo.add(a);
                    nhapTiep();
                    break;
                case 4: {
                    System.out.println("Tro lai chuong trinh chinh");
                    menu();
                    break;
                }
                default: {
                    System.err.println("Chon tu 1 - 3 de tao con vat");
                    them();
                }
            }
        } catch (Exception e) {
            System.err.println("Ban phai chon tu 1 - 4");
            them();
        }
    }

    public static void nhapTiep() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban co muon nhap tiep khong ? Nhan Enter hoac y hoac Y de nhap tiep");
        String str = sc.nextLine();
        if (str.equals("") || str.equals("y") || str.equals("Y")) {
            them();
        } else {
            menu();
        }
    }

    private static void xoa() {
        Scanner sc = new Scanner(System.in);
        if (zoo.listAnimal.isEmpty()) {
            System.err.println("Chua co con vat nao");
        } else {
            System.out.print("Nhap ten con vat can xoa:  ");
            zoo.remove(sc.nextLine());
        }
    }

    private static void say() {
        if (zoo.listAnimal.isEmpty()) {
            System.err.println("Chua co con vat nao");
        } else {
            System.out.println("Co tat ca " + zoo.listAnimal.size() + " con vat trong cong vien: ");
            zoo.sayHello();
        }
    }

    private static void thoat() {
        System.out.println("Ket thuc chuong trinh");
        System.exit(0);
    }
}
