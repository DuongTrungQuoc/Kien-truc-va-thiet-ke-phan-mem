package BaiTapJ4;

public class ChuyenXe {
  public String maSoChuyen;
  public String hoTenTaiXe;
  public String soXe;
  public double doanhThu;

  public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
    this.maSoChuyen = maSoChuyen;
    this.hoTenTaiXe = hoTenTaiXe;
    this.soXe = soXe;
    this.doanhThu = doanhThu;
  }

  public double getDoanhThu() {
    return doanhThu;
  }

  public void inThongTin(){
    System.out.println("Mã số chuyến");
    System.out.println("Họ tên tài xế");
    System.out.println("Mã số chuyến");
    System.out.println("Mã số chuyến");
  }
}
