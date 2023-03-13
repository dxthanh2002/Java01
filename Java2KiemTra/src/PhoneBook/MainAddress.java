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
                System.out.println("Wrong input!");
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
                    System.out.println("Enter new number:");
                    so = nhap.nextLine();
                    System.out.println("Enter new name:");
                    ten = nhap.nextLine();
                    b = db.ThemSo(so, ten);
                    if (!b) {
                        System.out.println("forget or duplicated number");
                    }
                    break;
                case 2:
                    System.out.println("My reaction to that infomation:");
                    db.Hienthi();
                    break;
                case 3:
                    System.out.println("Number:");
                    so = nhap.nextLine();
                    ten = db.Tratu(so);
                    if (ten.equals("")) {
                        System.out.println("Not found number '" + so + "'");
                    } else {
                        System.out.println("This number has a name " + ten);
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
