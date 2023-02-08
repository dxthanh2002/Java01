package demo_truycap.pk1;

public class class3 extends class1 {
    //class3 cùng gói thừa hưởng toàn bộ x1,x2,x3,x4
    //nhưng chỉ truy cập trực tiếp được
    //các thành phần public, protected và mặc định
    //trừ thành phần private từ lớp class1
    int x5;
    public void method2()
    {
       
    	x1 =10;
    	//x2 = 20;//không truy cập được trực tiếp x2 vì x2 là private của class1
        this.setX2(20);//gọi setX2 kế thừa từ class1
        x3  = 30;
    	x4 = 40;
    	x5 = 50;
    }
}
