package A1_BuilderPattern;

public class HoaDonHeader {
  String maHD;
  String ngayBan;
  String tenKH;

  public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
    this.maHD = maHD;
    this.ngayBan = ngayBan;
    this.tenKH = tenKH;
  }

  @Override
  public String toString() {
    return "Mã hóa đơn: " + maHD +
        ", ngày bán: " + ngayBan +
        ", tên khách hàng: " + tenKH ;
  }
}
