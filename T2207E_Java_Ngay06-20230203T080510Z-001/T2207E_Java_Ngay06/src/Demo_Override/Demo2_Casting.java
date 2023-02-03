/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Override;

/**
 *
 * @author Admin
 */
public class Demo2_Casting {
    public static void main(String[] args) {
        Student sv = new Student(9.5, "SV01", "Sinh viên 1", 2000);
        //gán đối tượng kiểu lớp con cho biến kiểu cha
        Person p = sv; //UpCasting
        //Person p = new Student(9.5, "SV01", "Sinh viên 1", 2000);;
        System.out.println("Thông tin sinh viên 1:");
        //khi đó các phương thức được ghi đè sẽ được gọi từ đối tượng lớp con
        p.Display();//gọi Display() của Student
        //biến kiểu lớp cha thì chỉ truy cập được các phương thức khai ở lớp cha
        //p.setMark(10);
        Person p2 = new Person("P01", "Person 01", 2001);
        //Student sv2 = p2;//không ép kiểu tự động từ đối tượng kiểu cha về con
        Student sv2 = (Student) p2;//DownCasting: phải ép kiểu rõ ràng
        sv2.setMark(8.5);
        System.out.println("Thông tin p2:");
        sv2.Display();
    }
}
