package StrateryPattern.BaiTapCC1;

public class Main {
  public static void main(String[] args) {
    Context context = new Context();

    context.setTinhToan(new Cong());
    System.out.println("10 + 2 = "+context.tinh(10,2));
  }
}
