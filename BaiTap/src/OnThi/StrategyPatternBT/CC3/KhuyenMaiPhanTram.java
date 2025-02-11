package OnThi.StrategyPatternBT.CC3;

public class KhuyenMaiPhanTram implements KhuyenMai{
  private double phanTram;
  private double giamToiDa;

  public KhuyenMaiPhanTram(double phanTram, double giamToiDa) {
    this.phanTram = phanTram;
    this.giamToiDa = giamToiDa;
  }

  @Override
  public double apDungKhuyenMai(double tongTien) {
    double giamGia = tongTien*(phanTram/100);
    return Math.min(giamGia,giamToiDa);
  }
}
