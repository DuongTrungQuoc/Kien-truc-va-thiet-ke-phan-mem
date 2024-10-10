package BaiTapJ3;

public abstract class SinhVienNTU {
  private String hoTen;
  private String nganh;

  public SinhVienNTU(String hoTen, String nganh) {
    this.hoTen = hoTen;
    this.nganh = nganh;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getNganh() {
    return nganh;
  }

  public void setNganh(String nganh) {
    this.nganh = nganh;
  }

  public abstract double getDiemTB();

  public String getHocLuc(){
    double diemTB = getDiemTB();
    if (diemTB < 5) return "Yếu";
    if (diemTB < 6.5) return "Trung Bình";
    if (diemTB < 8) return "Khá";
    return "Giỏi";

  }
  public void inThongTin() {
    System.out.println("Tên: " + hoTen + ", Ngành: " + nganh + ", Điểm TB: " + getDiemTB() + ", Học lực: " + getHocLuc());
  }

}
