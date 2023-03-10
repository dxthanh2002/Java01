package demo_truycap.pk1;

public class class1 {
    int x1;//quyền truy cập mặc định
    private int x2;//quyền truy cập nội bộ lớp
    protected int x3;
    public int x4;

    //phương thức method1 ở cùng 1 lớp với các thuộc tính x1,x2,x3,x4 thì sẽ truy cập được toàn bộ các thuộc tính trên
    public void method1()
    {
            x1 = 10;
            x2 = 20;
            x3 = 30;
            x4 = 40;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }
        
    public int getX2()
    {
        return x2;
    }
    public void setX2(int n)
    {
        if(n>0)
            x2 = n;
    }
}

