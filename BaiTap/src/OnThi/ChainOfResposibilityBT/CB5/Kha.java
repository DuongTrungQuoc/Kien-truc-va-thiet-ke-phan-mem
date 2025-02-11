package OnThi.ChainOfResposibilityBT.CB5;

public class Kha extends XepLoai{
  @Override
  public void xepLoai(double diem) {
    if (diem <8 && diem >=7){
      System.out.println("Hoc sinh Kha");
    } else super.xepLoai(diem);
  }
}
