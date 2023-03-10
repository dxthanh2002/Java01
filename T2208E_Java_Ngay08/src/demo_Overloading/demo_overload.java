/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_Overloading;

/**
 *
 * @author Tran Manh Truong
 */
public class demo_overload {
    //Overload(Nạp chồng) phương thức: 
    //cho phép tạo các phương thức cùng Tên nhưng khác số lượng tham số 
    //hoặc khác kiểu dữ liệu của các tham số
    //khi gọi phương thức thì Java dựa vào số lượng và kiểu dữ liệu
    //của các tham số thực truyền vào khi gọi hàm để thực thi hàm tương ứng
    public static int Tong(int a, int b)
    {
        System.out.println("Tổng 2 số int");
        return a+b;
    }
    public static float Tong(float a, float b)
    {
        System.out.println("Tổng 2 số float");
        return a+b;
    }
    public static double Tong(String a, String b)
    {
        System.out.println("Tổng 2 số dạng String");
        double n1,n2;
        n1 = Double.parseDouble(a);
        n2 = Double.parseDouble(b);
        return n1+n2;
    }
    public static void main(String args[])
    {
        int n1=10, n2=20;
        float n3=15.5f, n4=5f;
        double n5 = 5.5;
        System.out.println("Tong 1 = " + Tong(n1,n2));
        System.out.println("Tong 2 = " + Tong(n3,n4));
        //n1 là int, n là float thì gọi Tong(float a,float b)
        //n1 là int tự cast (ép kiểu) về float
        System.out.println("Tong 3 = " + Tong(n1,n3));

        //Lênh dưới lỗi vì không có hàm Tong nhận tham số là double
        //System.out.println("Tong 4 = " + Tong(n3,n5);
        //ép kiểu n5 về float thì hàm Tong(float a,float b) được gọi
        System.out.println("Tong 4 = " + Tong(n3,(float)n5));
        //tổng với tham số là 2 String
        System.out.println("Tong 5 = " + Tong("12","34"));
    }
}





