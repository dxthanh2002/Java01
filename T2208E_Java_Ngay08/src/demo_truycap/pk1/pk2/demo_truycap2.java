package demo_truycap.pk1.pk2;

import demo_truycap.pk1.class1;

//demo truy cập tới lớp class từ một lớp nằm trong gói khác (package pk2)
public class demo_truycap2 {
	public static void main(String[] args)
	{
		//demo_truycap.pk1.class1 o2 = new demo_truycap.pk1.class1();
		class1 o1 = new class1();
		//o1.x1 = 10;
                //o1.x2 = 10;
                //o1.x3 = 10;
                o1.x4 = 40;
                //lớp demo_truycap2 nằm ở khác package với lớp class1 
                //thì chỉ truy cập được thành phần public
	}
}
