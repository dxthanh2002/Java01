package Demo03_interface;

class HinhTron  implements   Hinh
{
  private float r;
  public HinhTron(float r) {
    this.r = r;
  }
  //ghi đè phương thức tinhDienTich của lớp Hinh
  @Override
  public double tinhDienTich() {
    return r * r * Math.PI;
  }
  //ghi đè phương thức tinhChuVi của lớp Hinh
  @Override
  public double tinhChuVi() {
    return 2 * r * Math.PI;
  }
  //ghi đè phương thức hienThi của lớp Hinh
  @Override
  public void hienThi(){
    System.out.println("ban kinh: " + r);
  }
}
