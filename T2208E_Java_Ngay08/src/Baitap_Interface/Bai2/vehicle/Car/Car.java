
package Baitap_Interface.Bai2.vehicle.Car;

import java.util.Scanner;

/**
 *
 * @author Success Rain
 */
public class Car extends Baitap_Interface.Bai2.vehicle.Vehicles{
//    Buoi08.vehicle.Vehicle vehicle = new Buoi08.vehicle.Vehicle();
    private String color;
    @Override
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập nhà sản xuất: ");
        setMaker(in.nextLine());
        System.out.println("Nhập model: ");
        setModel(in.nextLine());
        System.out.println("Nhập giá");
        setPrice(in.nextDouble());
        in.nextLine();
//        input();
        System.out.println("Nhập màu: ");
        color=in.nextLine();
    }
    @Override
    public void display(){
//        display();
//        System.out.println("Color: "+color);
        System.out.println("NSX: "+getMaker()+"\nModel: "+getModel()+""
                + "\nPrice: "+getPrice()+"\nColor: "+color);        
    }
}
