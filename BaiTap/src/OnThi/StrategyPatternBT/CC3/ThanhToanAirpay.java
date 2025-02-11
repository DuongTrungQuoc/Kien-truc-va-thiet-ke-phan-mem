package OnThi.StrategyPatternBT.CC3;

public class ThanhToanAirpay implements ThanhToan{

  @Override
  public double tinhGiamGia(double tongTien) {
    if(tongTien >= 1000000){
      return tongTien*0.03;
    }
    return 0;
  }
}
