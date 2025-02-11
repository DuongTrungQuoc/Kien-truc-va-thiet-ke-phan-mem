package f88;

public class ChuTich extends NhanVienF88{
  public ChuTich(String ten, String chucVu, int hanMucChoVay) {
    super(ten, chucVu, hanMucChoVay);
  }

  @Override
  public String duyetKhoanVay(int soTienVay) {
    if(soTienVay <= hanMucChoVay) {
      StringBuilder builder = new StringBuilder();
      builder.append(chucVu).append(" ")
          .append(ten)
          .append(" xu ly khoan vay ")
          .append(soTienVay);
      return builder.toString();
    }
    return "Eximbank duyet khoan vay";
  }

  @Override
  public NhanVienF88 capTren(NhanVienF88 nv) {
    return null;
  }
}
