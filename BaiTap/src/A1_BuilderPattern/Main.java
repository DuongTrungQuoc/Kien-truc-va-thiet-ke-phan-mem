package A1_BuilderPattern;

public class Main {
  public static void main(String[] args) {
    HoaDon hoaDon = new HoaDon.Builder()
        .setHeader("HD001", "2024-10-18", "Nguyen Van A")
        .addCTHD("Laptop", 1, 15000000)
        .addCTHD("Mouse", 2, 500000)
        .build();

    System.out.println(hoaDon);
  }
}
