package B1_DecoratorPattern;

public class Main {
  public static void main(String[] args) {
    // Tính (6+9)*8 + 5
    BieuThuc bieuThuc1 = new Cong(new Nhan(new Cong(new BieuThucDonGian(6), 9), 8), 5);
    System.out.println("Biểu thức: " + bieuThuc1.bieuThuc() + " = " + bieuThuc1.giaTri());

    // Tính (8+6)/2*5 + 8 - 4
    BieuThuc bieuThuc2 = new Tru(new Cong(new Nhan(new Chia(new Cong(new BieuThucDonGian(8), 6), 2), 5), 8), 4);
    System.out.println("Biểu thức: " + bieuThuc2.bieuThuc() + " = " + bieuThuc2.giaTri());
  }
}
