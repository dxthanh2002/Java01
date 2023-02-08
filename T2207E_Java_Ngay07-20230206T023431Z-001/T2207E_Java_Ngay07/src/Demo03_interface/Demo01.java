package Demo03_interface;

import java.util.Scanner;

class Demo01 {
    public static void main(String[] args) {
        HinhVuong hv1 = new HinhVuong(3);
        HinhCN hcn1 = new HinhCN(4, 6);
        HinhTron ht1 = new HinhTron(2);
        TamGiac tg1 = new TamGiac(3, 4, 5);
        System.out.println("Hình vuông:");
        print(hv1);
        System.out.println("Hình chữ nhật:");
        print(hcn1);
        System.out.println("Hình tròn:");
        print(ht1);
        System.out.println("Hình tam giác:");
        print(tg1);
    }
    public static void print(Hinh h){
        System.out.println("Chu vi:" + h.tinhChuVi());
        System.out.println("Diện tích:" + h.tinhDienTich());
        System.out.println("Hiển thị:");
        h.hienThi();
    }
 }
