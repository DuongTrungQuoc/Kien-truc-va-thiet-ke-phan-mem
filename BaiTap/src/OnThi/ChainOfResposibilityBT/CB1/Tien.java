package OnThi.ChainOfResposibilityBT.CB1;

public abstract class Tien implements ITien{
  protected ITien menhGiakeTiep;

  @Override
  public void keTiep(ITien menhGiaKeTiep) {
    this.menhGiakeTiep = menhGiaKeTiep;
  }

  @Override
  public void xuLi(int tien) {
    if(menhGiakeTiep != null){
      menhGiakeTiep.xuLi(tien);
    }
  }
}
