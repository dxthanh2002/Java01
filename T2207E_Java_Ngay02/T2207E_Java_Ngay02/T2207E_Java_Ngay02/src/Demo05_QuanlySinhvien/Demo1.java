/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo05_QuanlySinhvien;

/**
 *
 * @author Admin
 */
public class Demo1 {
    public static void main(String[] args) {
        //Primitive data type
        //khai báo biến x kiểu dữ liệu int
        int x;
        x = 10;
        //reference data type
        //khai báo biến sv kiểu dữ liệu là class Sinhvien
        Sinhvien sv; //sv = null (chưa tham chiếu tới Sinhvien nào)
        //lệnh sv.MaSV = "SV01" lỗi do chưa tạo đối tượng gán cho sv
        //sv.MaSV = "SV01";
        //sv.Nhap();//lỗi do khởi tạo đối tượng
        sv = new Sinhvien();
        //new để gọi Constructor của lớp Sinhvien 
        //để tạo đối tượng (Object/Instance) Sinhvien gán cho sv
        sv.MaSV = "SV01";
        sv.setHoten("Nguyễn Văn Dũng");
        sv.setDiem(9.5);
        sv.Hienthi();
        //tạo đối tượng mới gán cho sv tham chiếu tới
        sv = new Sinhvien("SV02","Lê thị Hoa", 8.5);
        sv.Hienthi();//hiển thị Sinhvien mới
        //thông thường khai báo và khởi tạo đối tượng cùng 1 dòng
        Sinhvien sv2 = new Sinhvien();
        System.out.println("Nhập sv2:");
        sv2.Nhap();
        Sinhvien sv3 = sv2;//gán đối tượng của sv2 đang tham chiếu cho sv3
        System.out.println("Thông tin sv2:");
        sv3.Hienthi(); //tương đương sv2.Hienthi()
    }
}
