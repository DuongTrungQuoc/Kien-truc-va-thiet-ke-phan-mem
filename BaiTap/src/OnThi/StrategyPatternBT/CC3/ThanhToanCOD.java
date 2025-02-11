package OnThi.StrategyPatternBT.CC3;

public class ThanhToanCOD implements ThanhToan{
  @Override
  public double tinhGiamGia(double tongTien) {
    if(tongTien >= 2000000){
      return tongTien*0.02;
    }
    return 0;
  }
}
