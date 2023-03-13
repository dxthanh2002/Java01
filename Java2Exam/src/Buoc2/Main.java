package Buoc2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static int inputInt()
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
        while(true)
        {
            try{
                String str = sc.nextLine();
                n = Integer.parseInt(str);
                //n = sc.nextInt();
                return n;  
            }
            catch(NumberFormatException e)
            {
                System.out.println("Mời nhập số nguyên");
            }
        }
    }
    public static int Menu()
    {
        int choice;
        System.out.println("\n-----  MENU  -----");
        System.out.println("1. Add new Students");
        System.out.println("2. Save");
        System.out.println("3. Display All Students");
        System.out.println("4. Exit");
        choice = inputInt();
        return choice;
                
    }
    public static void main(String[] args) {
        StudentManager stm = new StudentManager();
        int choice;
        do{
            choice = Menu();
            //xử lý chọn
            switch(choice)
            {
                case 1:
                    System.out.println("Add new Students");
                    stm.InputList();
                    System.out.println("Input Completed");
                    break;
                case 2:
                    System.out.println("Save to Student.dat");
                    boolean b1 = stm.SaveToFile("Student.dat");
                    if(b1==true)
                        System.out.println("Save Successfull!");
                    else
                        System.out.println("Save Fail!");
                    break;
                case 3:
                    System.out.println("Display all Students");
                    boolean b2 = stm.LoadFromFile("Student.dat");
                    if(b2==true)
                        stm.DisplayList();
                    else
                        System.out.println("Fail to Load data!");
                    break;
                case 4:
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Pls, Input 1-4");
            }
        }while(choice!=4);
    }
   
}
