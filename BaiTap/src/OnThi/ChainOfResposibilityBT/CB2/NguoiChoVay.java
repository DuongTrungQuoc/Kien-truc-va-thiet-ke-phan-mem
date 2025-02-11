package OnThi.ChainOfResposibilityBT.CB2;

public abstract class NguoiChoVay implements INguoiChoVay{
  protected INguoiChoVay nguoiChoVayTiepTheo;

  @Override
  public void keTiep(INguoiChoVay nguoiChoVay) {
      this.nguoiChoVayTiepTheo = nguoiChoVay;
  }

  @Override
  public void choVay(double soTien) {
      if(nguoiChoVayTiepTheo != null)
      {
        nguoiChoVayTiepTheo.choVay(soTien); // chuyen tiep cho nguoi cho vay tiep theo
      }
  }
}
