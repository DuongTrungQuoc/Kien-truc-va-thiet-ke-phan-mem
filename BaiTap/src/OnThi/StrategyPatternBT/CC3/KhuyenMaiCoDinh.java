package OnThi.StrategyPatternBT.CC3;

public class KhuyenMaiCoDinh implements KhuyenMai{
  private double mucGiam;

  public KhuyenMaiCoDinh(double mucGiam) {
    this.mucGiam = mucGiam;
  }

  @Override
  public double apDungKhuyenMai(double tongTien) {

    return Math.min(mucGiam, tongTien);
  }
}
