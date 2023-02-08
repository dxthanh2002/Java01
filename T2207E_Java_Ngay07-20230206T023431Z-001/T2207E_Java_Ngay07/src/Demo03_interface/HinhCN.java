package Demo03_interface;

class HinhCN   implements   Hinh
{
  private float cd, cr;

  public HinhCN(float cd, float cr) {
    this.cd = cd;
    this.cr = cr;
  }

  //ghi đè phương thức tinhDienTich của lớp Hinh
  @Override
  public double tinhDienTich() {
    return cd * cr;
  }

  //ghi đè phương thức tinhChuVi của lớp Hinh
  @Override
  public double tinhChuVi() {
    return 2 * (cd + cr);
  }

  //ghi đè phương thức hienThi của lớp Hinh
  @Override
  public void hienThi(){
    System.out.println("cd: " + cd + ", cr: " + cr);
  }
}
