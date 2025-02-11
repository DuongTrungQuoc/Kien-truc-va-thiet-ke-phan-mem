package OnThi.ChainOfResposibilityBT.CB2;

public class GiamDoc extends NguoiChoVay{
  @Override
  public void choVay(double soTien) {
    if(soTien <=2000){
      System.out.println("Giam doc cho vay: "+soTien);
    } else if (nguoiChoVayTiepTheo != null) {
      nguoiChoVayTiepTheo.choVay(soTien);
    }
  }
}
