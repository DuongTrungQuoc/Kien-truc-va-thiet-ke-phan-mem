package OnThi.ChainOfResposibilityBT.CB2;

public class TruongPhong extends NguoiChoVay{
  @Override
  public void choVay(double soTien) {
    if(soTien <= 1000){
      System.out.println("Truong phong cho vay: "+ soTien);
    } else if (nguoiChoVayTiepTheo != null) {
      nguoiChoVayTiepTheo.choVay(soTien);
    }
  }
}
