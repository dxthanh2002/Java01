package Demo03_interface;

class TamGiac
     implements   Hinh {
  private float a, b, c;
  public TamGiac(float a, float b, float c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  //ghi đè phương thức tinhDienTich của lớp Hinh
  @Override
  public double tinhDienTich() {
    float p = (a + b + c) / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  //ghi đè phương thức tinhChuVi của lớp Hinh
  @Override
  public double tinhChuVi() {
    return (a + b + c);
  }

  //ghi đè phương thức hienThi của lớp Hinh
  @Override
  public void hienThi() {
    System.out.println("A: " + a + ", B: " + b + ", C: " + c);
  }
}
