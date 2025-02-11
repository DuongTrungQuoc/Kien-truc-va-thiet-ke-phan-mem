package OnThi.StrategyPattern.CC1;

public class Main {
  public static void main(String[] args) {
    Context context = new Context();

    // Phép cộng
    context.setTinhToan(new Cong());
    System.out.println("75 + 12 = " + context.tinh(75, 12));

    // Phép trừ
    context.setTinhToan(new Tru());
    System.out.println("54 - 78 = " + context.tinh(54, 78));

    // Phép nhân
    context.setTinhToan(new Nhan());
    System.out.println("6 * 9 = " + context.tinh(6, 9));

    // Phép chia
    context.setTinhToan(new Chia());
    System.out.println("81 / 9 = " + context.tinh(81, 9));
  }
}
