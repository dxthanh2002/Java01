package Baitap_Interface.Bai2.vehicle.Test;

import Baitap_Interface.Bai2.vehicle.Car.Car;
import Baitap_Interface.Bai2.vehicle.Truck.Truck;
import Baitap_Interface.Bai2.vehicle.Vehicles;
import java.util.Scanner;

/**
 *
 * @author Success Rain
 */
public class Test {

    static Car car[] = new Car[100];
    static Truck truck[] = new Truck[100];

    public Test() {
        for (int i = 0; i < 100; i++) {
            car[i] = new Car();
            truck[i] = new Truck();
        }
    }

    public static void main(String[] args) {
        new Test();
        int chon = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("1. Input\n2. Display\n3. Sort by price\n4. Search by model\n5. Exit");        
        while (chon != 5) {
            System.out.println("Xin bạn chọn chức năng:");
            chon = in.nextInt();
            switch (chon) {
                case 1: {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Nhập thông tin xe hơi thứ "+(i+1)+"\n");
                        input(car[i]);
                        System.out.println("Nhập thông tin xe tải thứ "+(i+1)+"\n");
                        input(truck[i]);
                    }
                    break;
                }
                case 2: {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Thông tin xe hơi thứ "+(i+1)+" là:\n");
                        disPlay(car[i]);
                        System.out.println("Thông tin xe tải thứ "+(i+1)+" là:\n");
                        disPlay(truck[i]);
                    }
                    break;
                }
                case 3: {
                    for(int i=2;i>0;i--){
                        for(int j=0;j<i;j++){
                            if(car[j].getPrice()>car[j+1].getPrice()){
                                Car tam = car[j];
                                car[j] = car[j+1];
                                car[j+1]= tam;
                            }
                            if(truck[j].getPrice()>truck[j+1].getPrice()){
                                Truck tmp = truck[j];
                                truck[j] = truck[j+1];
                                truck[j+1]= tmp;
                            }
                        }
                    }
                    System.out.println("Thông tin xe hơi khi đã sắp xếp theo giá tăng dần là:\n");
                    for (int i = 0; i < 3; i++) {                        
                        disPlay(car[i]);                        
                    }
                    System.out.println("Thông tin xe tải khi đã sắp xếp theo giá tăng dần là:\n");
                    for (int i = 0; i < 3; i++) {                        
                        disPlay(truck[i]);                        
                    }
                    break;
                }
                case 4: {
                    String tk;
                    Scanner input = new Scanner(System.in);
                    System.out.println("Nhập xâu model cần tìm kiếm: ");
                    tk=input.nextLine();
                    System.out.println("Các xe hơi được tìm thấy theo từ khóa: \n");
                    for(int i=0;i<3;i++){
                        if(car[i].getModel().contains(tk)){
                            disPlay(car[i]);
                        }
                    }
                    System.out.println("Các xe tải được tìm thấy theo từ khóa: \n");
                    for(int i=0;i<3;i++){
                        if(truck[i].getModel().contains(tk)){
                            disPlay(truck[i]);
                        }
                    }
                    break;
                }
                case 5: System.out.println("Thoát.");break;
                default : System.out.println("Bạn đã nhập sai chức năng.");
            }
        }
    }

    public static void input(Vehicles vehicle) {
        vehicle.input();
    }

    public static void disPlay(Vehicles vehicle) {
        vehicle.display();
    }
}
