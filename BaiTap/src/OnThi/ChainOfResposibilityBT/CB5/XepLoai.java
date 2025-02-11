package OnThi.ChainOfResposibilityBT.CB5;

public abstract class XepLoai implements IXepLoai{
  protected IXepLoai xepLoaiKeTiep;
  @Override
  public void keTiep(IXepLoai xepLoaiKeTiep) {
    this.xepLoaiKeTiep = xepLoaiKeTiep;
  }

  @Override
  public void xepLoai(double diem) {
    if(xepLoaiKeTiep != null){
      xepLoaiKeTiep.xepLoai(diem);
    }
  }
}
