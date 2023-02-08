package demo_truycap.pk1.pk2;

import demo_truycap.pk1.class1;


public class class2 extends class1 {
    //class2 được kế thừa toàn bộ: x1, x2,x3,x4 và method1() của class1
    //nhưng do là lớp con khác gói nên chỉ được truy cập thành phần 
    //public, protected
    int x6;
    public void method2()
    {
        //x1 = 10;//lỗi do x1 là quyền mặc định (default)
        //x2 = 20;//lỗi do x2 là quền private
        this.setX1(10);//gọi setX1 kế thừa từ class1
        this.setX2(20);//gọi setX2 kế thừa từ class1
        x3 = 30;
        x4 = 40;
        x6 = 50;
    }
}
