package Baitap_Interface.Bai1;
import java.util.Scanner;
public class Demo {
    public static void Work(Hinh h){
        h.Nhap();
        h.Hienthi();
        System.out.println("Diện tích: " + h.Dientich());
        System.out.println("Chu vi: " + h.Chuvi());
    }
    public static int menu(){
        int chon =0;
        //hiện menu và nhập chọn
        Scanner nhap = new Scanner(System.in);
        try
        {
            System.out.println("Chọn hình:\n 1.Hình chữ nhật\n 2.Hình vuông"
                    + "\n 3.Hình tròn\n 4.Thoát");
            System.out.println("Mời bạn nhập lựa chọn:");
            chon = nhap.nextInt();
        }
        catch(java.util.InputMismatchException e)
        {
            System.out.println("Bạn phải nhập số");
        }
        return chon;
    }
    public static void main(String[] args) {
       int chon;
       do{
           //hiển thị menu và và nhập sô nguyên trả về gán cho biến chon
           chon = menu();
           switch(chon){
               case 1:
                   Hinhchunhat hcn = new Hinhchunhat();
                   Work(hcn);
                   break;
               case 2:
                   Hinhvuong hv = new Hinhvuong();
                   Work(hv);
                   break;
               case 3: 
                   Hinhtron ht = new Hinhtron();
                   Work(ht);
                   break;
               case 4:
                   System.out.println("Goodbye!!! Never see agian!");
                   break;
               default:
                   System.out.println("Không biết đọc à?");
           }
       }while(chon!=4);
    }
}
