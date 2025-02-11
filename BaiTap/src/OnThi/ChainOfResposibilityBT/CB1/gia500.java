package OnThi.ChainOfResposibilityBT.CB1;

public class gia500 extends Tien{
  @Override
  public void xuLi(int tien) {
    if(tien >=500){
      int soTo = tien / 500;
      System.out.println(soTo + " to menh gia 500");
      tien = tien % 500;
    }
    super.xuLi(tien);
  }
}
