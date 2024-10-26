package B4_Composite_quanLiMonHoc;

public class MonHoc extends KeHoachHocTap{
  private int soTC;
  private int hp;

  public MonHoc(String ten, int soTC, int hp) {
    super(ten);
    this.soTC = soTC;
    this.hp = hp;
  }

  @Override
  public int getSoTC() {
    return soTC;
  }

  @Override
  public int getHP() {
    return soTC*hp;
  }

  @Override
  public String thongTin() {
    return "  Môn học: " + ten + ", Số tín chỉ: " + soTC + ", Học phí: " + hp;
  }
}
