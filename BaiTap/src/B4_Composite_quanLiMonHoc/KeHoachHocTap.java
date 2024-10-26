package B4_Composite_quanLiMonHoc;

abstract class KeHoachHocTap {
  protected String ten;

  public KeHoachHocTap(String ten) {
    this.ten = ten;
  }

  public void add(KeHoachHocTap k) {
  }

  public void remove(KeHoachHocTap k) {
  }

  public abstract int getSoTC();
  public abstract int getHP();
  public abstract String thongTin();
}
