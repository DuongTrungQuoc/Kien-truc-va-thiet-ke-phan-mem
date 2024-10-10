package StrateryPattern.BaiTapCC2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
  List<SinhVien> svs = new ArrayList<>();
  ISoSanh<SinhVien> soSanh;

  public void sapXep(){
    svs.sort((o1, o2) -> soSanh.soSanh(o1,o2));
  }
  public void sapXep2(){

  }
  public void inDS(){
    svs.forEach((t)-> {
      System.out.println(t.toString());
    });
  }
  public void setSoSanh(ISoSanh<SinhVien> soSanh){
    this.soSanh = soSanh;
  }
}
