package OnThi.StrategyPatternBT.CC3;

public class SanPham {
  private String ten;
  private int soLuong;
  private double gia;

  public SanPham(String ten, int soLuong, double gia) {
    this.ten = ten;
    this.soLuong = soLuong;
    this.gia = gia;
  }

  public double tinhTongGia(){
    return soLuong*gia;
  }

  @Override
  public String toString() {
    return ten + " x " + soLuong + " = " +tinhTongGia();
  }
}
