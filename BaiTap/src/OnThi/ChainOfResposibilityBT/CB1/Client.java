package OnThi.ChainOfResposibilityBT.CB1;

public class Client {
  public static void main(String[] args) {
    Tien gia500 = new gia500();
    Tien gia100 = new gia100();
    Tien gia50 = new gia50();
    Tien gia10 = new gia10();
    Tien gia1 = new gia1();

    // Tao chuoi

    gia500.keTiep(gia100);
    gia100.keTiep(gia50);
    gia50.keTiep(gia10);
    gia10.keTiep(gia1);

    // rut tien

    gia500.xuLi(293);
  }
}
