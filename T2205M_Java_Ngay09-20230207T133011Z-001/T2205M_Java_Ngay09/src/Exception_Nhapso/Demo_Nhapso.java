/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Nhapso;

/**
 *
 * @author Admin
 */
public class Demo_Nhapso {
    public static void main(String[] args) {
        int tuoi;
        System.out.println("Nhập tuổi:");
        tuoi = Tienich.NhapsoInt();
        System.out.println("Tuổi: " + tuoi);
        double diem;
        System.out.println("Nhập điểm:");
        diem = Tienich.NhapsoDouble();
        System.out.println("Điểm: " + diem);
    }
}
