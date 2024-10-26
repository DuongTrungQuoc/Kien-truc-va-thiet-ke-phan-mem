package B4_Composite_quanLiMonHoc;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{
  private List<KeHoachHocTap> components = new ArrayList<>();

  public KeHoachChung(String ten) {
    super(ten);
  }

  @Override
  public void add(KeHoachHocTap k) {
    components.add(k);
  }

  @Override
  public void remove(KeHoachHocTap k) {
    components.remove(k);
  }

  @Override
  public int getSoTC() {
    int tongTC = 0;
    for (KeHoachHocTap k : components) {
      tongTC += k.getSoTC();
    }
    return tongTC;
  }

  @Override
  public int getHP() {
    int tongHP = 0;
    for (KeHoachHocTap k : components) {
      tongHP += k.getHP();
    }
    return tongHP;
  }

  @Override
  public String thongTin() {
    StringBuilder info = new StringBuilder(ten + "\n");
    for (KeHoachHocTap component : components) {
      info.append("  ").append(component.thongTin()).append("\n");
    }
    return info.toString();
  }
}
