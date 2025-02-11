package OnThi.ChainOfResposibilityBT.CB5;

public class XuatSac extends XepLoai{
  @Override
  public void xepLoai(double diem) {
    if (diem <=10 && diem >=9){
      System.out.println("Hoc sinh Xuat Sac");
    } else super.xepLoai(diem);
  }
}
