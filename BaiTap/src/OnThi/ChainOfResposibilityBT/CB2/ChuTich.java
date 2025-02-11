package OnThi.ChainOfResposibilityBT.CB2;

public class ChuTich extends NguoiChoVay{
  @Override
  public void choVay(double soTien) {
    if (soTien <=5000) {
      System.out.println("Chu Tich cho vay: "+ soTien);
    } else System.out.println("Đéo cho vay, cút mẹ m đi");
  }
}
