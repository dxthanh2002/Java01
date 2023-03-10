package demo_truycap.pk1;
//demo truy cập các thành phần của class1 từ 1 lớp nằm trong cùng gói (package pk1)
public class demo_truycap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 o1 = new class1();
                
		o1.x1 = 10;
		//o1.x2 = 20; //không truy cập được thuộc tính x2 do x2 là private của class1
                o1.setX2(20);//truy cập x2 thông qua phương thức public
		o1.x3 =30;
		o1.x4 = 40;
	}

}
