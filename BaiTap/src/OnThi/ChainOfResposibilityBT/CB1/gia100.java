package OnThi.ChainOfResposibilityBT.CB1;

public class gia100 extends Tien{
  @Override
  public void xuLi(int tien) {
    if (tien >= 100){
      int soTo = tien /100;
      System.out.println(soTo + " to menh gia 100");
      tien = tien % 100;
    }
    super.xuLi(tien);
  }
}
