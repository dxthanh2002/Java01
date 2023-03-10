
package Baitap_Interface.Bai2.vehicle.Truck;

import java.util.Scanner;

/**
 *
 * @author Success Rain
 */
public class Truck extends Baitap_Interface.Bai2.vehicle.Vehicles{
    private int truckload;
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
        System.out.println("Nhập số lượng xe: ");
        truckload=in.nextInt();
    }
    @Override
    public void display(){
        System.out.println("NSX: "+getMaker()+"\nModel: "+getModel()+""
                + "\nPrice: "+getPrice()+"\nTruckload: "+truckload);        
    }
}
