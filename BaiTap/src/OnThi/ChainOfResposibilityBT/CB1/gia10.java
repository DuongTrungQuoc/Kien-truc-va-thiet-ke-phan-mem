package OnThi.ChainOfResposibilityBT.CB1;

public class gia10 extends Tien{
  @Override
  public void xuLi(int tien) {
    if (tien >= 10){
      int soTo = tien /10;
      System.out.println(soTo + " to menh gia 10");
      tien = tien % 10;
    }
    super.xuLi(tien);
  }
}
