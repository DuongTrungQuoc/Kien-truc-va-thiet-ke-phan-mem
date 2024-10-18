package A1_BuilderPattern;

public class CTHD {
  String sp;
  int sl;
  int gia;

  public CTHD(String sp, int sl, int gia) {
    this.sp = sp;
    this.sl = sl;
    this.gia = gia;
  }

  @Override
  public String toString() {
    return "sản phẩm: " + sp +
        ", số lượng: " + sl +
        ", giá:" + gia;
  }

}
