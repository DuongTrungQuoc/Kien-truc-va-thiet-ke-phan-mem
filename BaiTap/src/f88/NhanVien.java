package f88;

public class NhanVien extends NhanVienF88{
  public NhanVien(String ten, String chucVu, int hanMucChoVay) {
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
    return capTren.duyetKhoanVay(soTienVay);
  }

  @Override
  public NhanVienF88 capTren(NhanVienF88 nv) {
    this.capTren = nv;
    return capTren;
  }
}
