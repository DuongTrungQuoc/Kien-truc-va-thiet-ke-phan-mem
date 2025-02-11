package OnThi.StrategyPatternBT.CC1;

public class Main {
  public static void main(String[] args) {
    Context context = new Context();
    context.setTinhToan(new Cong());
    System.out.println("75 + 12 = " + context.tinh(75,12));
  }
}
