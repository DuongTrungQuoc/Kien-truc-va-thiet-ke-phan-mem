package OnThi.ChainOfResposibilityBT.CB1;

public class gia50 extends Tien{
  @Override
  public void xuLi(int tien) {
    if (tien >= 50){
      int soTo = tien /50;
      System.out.println(soTo + " to menh gia 50");
      tien = tien % 50;
    }
    super.xuLi(tien);
  }
}
