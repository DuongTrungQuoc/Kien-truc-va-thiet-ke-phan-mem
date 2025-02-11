package f88;

abstract class NhanVienF88 {
  String ten;
  String chucVu;
  int hanMucChoVay;
  NhanVienF88 capTren;

  public NhanVienF88(String ten, String chucVu, int hanMucChoVay) {
    this.ten = ten;
    this.chucVu = chucVu;
    this.hanMucChoVay = hanMucChoVay;
  }

  public abstract String duyetKhoanVay(int soTienVay);

  public abstract NhanVienF88 capTren(NhanVienF88 nv);
}
