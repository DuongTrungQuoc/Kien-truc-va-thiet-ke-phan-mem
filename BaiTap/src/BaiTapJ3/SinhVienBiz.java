package BaiTapJ3;

public class SinhVienBiz extends SinhVienNTU{
  private float diemMarketing, diemSales;

  public SinhVienBiz(String hoTen, float diemMarketing, float diemSales) {
    super(hoTen, "Marketing");
    this.diemMarketing = diemMarketing;
    this.diemSales = diemSales;
  }

  @Override
  public double getDiemTB() {
    return (diemMarketing*2 + diemSales)/3;
  }
}
