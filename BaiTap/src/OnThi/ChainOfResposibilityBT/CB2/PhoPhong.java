package OnThi.ChainOfResposibilityBT.CB2;

public class PhoPhong extends NguoiChoVay{
  @Override
  public void choVay(double soTien) {
    if (soTien <=500){
      System.out.println("Pho phong cho vay: "+soTien);
    } else super.choVay(soTien);
  }
}
