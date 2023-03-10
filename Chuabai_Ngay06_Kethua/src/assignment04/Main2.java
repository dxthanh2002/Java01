/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment04;

import static assignment04.Main1_Dequi.menu;
import static assignment04.Main1_Dequi.zoo;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main2 {
    static Zoo zoo = new Zoo();
    public static int  menu() {
        Scanner sc = new Scanner(System.in);
        int menuID=0;
        while(true) {//vong lặp bẫy lỗi nhập chữ
            System.out.println("----------");
            System.out.println("1. Them vao con vat");
            System.out.println("2. Xoa con vat");
            System.out.println("3. Say hello All");
            System.out.println("4. Thoat");
            System.out.println("----------");
            System.out.print("Menu: ");
            try{
                menuID = sc.nextInt();
                break;//nhập đúng số thì thoát
            }catch(Exception e)
            {
                sc.nextLine();
                System.err.println("Phải nhập số 1-4");
                continue;//nhập chữ thì quay về đầu vòng lặp
            }  
        }
        System.out.println("Ban da chon menu :  " + menuID);
        return menuID;
    }
    public static void main(String[] args) {
        int menuID;
        do{
            menuID = menu();
            switch(menuID)
            {
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
                    System.err.println("Chon tu 1 - 4");
                    break;           
            }
        }while(menuID!=4);
    }
    private static void them() {
        Scanner sc = new Scanner(System.in);
        int typeAnimal=0;
        while(true){
            System.out.println("Nhap loai dong vat muon them: ");
            System.out.println("1. Animal");
            System.out.println("2. Cho");
            System.out.println("3. Meo");
            try {
                typeAnimal = sc.nextInt();
            }    
            catch (Exception e) {
                System.err.println("Ban phai chon tu 1 - 3");
                continue;
            }
            sc.nextLine();
             Animal a;
            if(typeAnimal==1)
                a= new Animal();
            else if(typeAnimal==2)
                a = new Dog();
            else
                a = new Cat();
            a.nhap();
            zoo.add(a);
            System.out.println("Ban co muon nhap tiep khong ? Nhan Enter hoac y hoac Y de nhap tiep");
            String str = sc.nextLine();
            if (str.equals("") || str.equals("y") || str.equals("Y")) 
                continue;
            else
                break;
        };
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
