package BaiTapJ1vaJ2;

public class NhanVien {
  private String ten;
  private int tuoi;
  private String diaChi;
  private double tienLuong;
  private int tongGioLam;

  public NhanVien() {
  }

  public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam) {
    this.ten = ten;
    this.tuoi = tuoi;
    this.diaChi = diaChi;
    this.tienLuong = tienLuong;
    this.tongGioLam = tongGioLam;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public double getTienLuong() {
    return tienLuong;
  }

  public void setTienLuong(double tienLuong) {
    this.tienLuong = tienLuong;
  }

  public int getTongGioLam() {
    return tongGioLam;
  }

  public void setTongGioLam(int tongGioLam) {
    this.tongGioLam = tongGioLam;
  }

  @Override
  public String toString() {
    return "Nhân viên: " + ten + ", Tuổi: " + tuoi + ", Địa chỉ: "+ diaChi +
        ", Tiền lương: "+tienLuong+", Tổng số giờ làm: " + tongGioLam +", Tiền thưởng: "+tinhThuong();
  }

  public double tinhThuong(){
      if(tongGioLam >= 200){
        return tienLuong*0.2;
      }else if(tongGioLam >=100){
        return tienLuong*0.1;
    } else return 0;
  }
}
