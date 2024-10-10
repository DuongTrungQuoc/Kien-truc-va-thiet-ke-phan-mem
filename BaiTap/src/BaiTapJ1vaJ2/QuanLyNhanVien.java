package BaiTapJ1vaJ2;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy{
  List<NhanVien> list = new ArrayList<>();
  @Override
  public void them(NhanVien nv) {
    list.add(nv);
  }

  @Override
  public void inDS() {
    for(NhanVien nv:list){
      System.out.println(nv);
    }
  }
}
