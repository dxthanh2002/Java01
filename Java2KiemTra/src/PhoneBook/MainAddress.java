/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhoneBook;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MainAddress {

    public static int Menu() {
        int chon;
        while (true) {
            try {
                Scanner nhap = new Scanner(System.in);
                System.out.println("+-------Address Book-------+"
                        + "\n|1.   Add a new contact    |"
                        + "\n|2.   Display all          |"
                        + "\n|3.   Search               |"
                        + "\n|4.   Exit                 |"
                        + "\n+------ Pls Choose --------+");
                chon = nhap.nextInt();
                return chon;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Bạn nhập sai");
                System.out.println(e.getMessage());
                continue;
            }
        }
    }

    public static void main(String[] args) {
        int chon;
        Scanner nhap = new Scanner(System.in);
        Contact db = new Contact();
        String ten, so;
        boolean b;
        do {
            chon = Menu();
            switch (chon) {
                case 1:
                    System.out.println("Enter new name:");
                    ten = nhap.nextLine();
                    System.out.println("Enter new number:");
                    so = nhap.nextLine();
                    b = db.ThemSo(ten, so);
                    if (!b) {
                        System.out.println("Lỗi thêm tên");
                    }
                    break;
                case 2:
                    System.out.println("Thông tin danh bạ:");
                    db.Hienthi();
                    break;
                case 3:
                    System.out.println("Tên người:");
                    ten = nhap.nextLine();
                    so = db.Tratu(ten);
                    if (so.equals("")) {
                        System.out.println("Chưa có tên '" + ten + "'");
                    } else {
                        System.out.println("Tên danh bạ có số " + so);
                    }
                    break;
                case 4:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        } while (chon != 4);
    }

}
