package Demo03_interface;

import java.util.Scanner;

class Demo02 {

    public static void main(String[] args) {
        HinhVuong hv1 = new HinhVuong(3);
        HinhCN hcn1 = new HinhCN(4, 6);
        HinhTron ht1 = new HinhTron(2);
        TamGiac tg1 = new TamGiac(3, 4, 5);
        int chon;
        System.out.print("Ban chon hình nào (1:vuong\n"
                        + "2:chu chat\n3:tron\n4:tamgiac:");
        Scanner nhap = new Scanner(System.in);
        chon = nhap.nextInt();
        switch(chon)
        {
            case 1:
                print(hv1);
                break;
            case 2:
                print(hcn1);
                break;
            case 3:
                print(ht1);
                break;
            case 4:
                print(tg1);
                break;
        }
    }
    public static void print(Hinh h){
        System.out.println(h.tinhChuVi());
        System.out.println(h.tinhDienTich());
        h.hienThi();
    }
    
}
