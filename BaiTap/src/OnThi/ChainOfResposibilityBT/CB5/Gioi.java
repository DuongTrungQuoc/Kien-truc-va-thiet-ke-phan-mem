package OnThi.ChainOfResposibilityBT.CB5;

public class Gioi extends XepLoai{
  @Override
  public void xepLoai(double diem) {
    if (diem <9 && diem >=8){
      System.out.println("Hoc sinh Gioi");
    } else super.xepLoai(diem);
  }
}
