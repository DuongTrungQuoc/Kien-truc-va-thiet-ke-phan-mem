package OnThi.StrategyPatternBT.CC3;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
  private List<SanPham> danhSachSanPham = new ArrayList<>();
  private ThanhToan phuongThucThanhToan;
  private KhuyenMai chuongTrinhKhuyenMai;

  public void themSanPham(SanPham sanPham){
    danhSachSanPham.add(sanPham);
  }

  public void chonPhuongThucThanhToan(ThanhToan thanhToan){
    this.phuongThucThanhToan = thanhToan;
  }

  public void chonChuongTrinhKhuyenMai(KhuyenMai khuyenMai){
    this.chuongTrinhKhuyenMai = khuyenMai;
  }

  public void thanhToan() {
    double tongTien = danhSachSanPham.stream().mapToDouble(SanPham::tinhTongGia).sum();

    double giamGiaThanhToan = (phuongThucThanhToan != null) ? phuongThucThanhToan.tinhGiamGia(tongTien) : 0;
    System.out.println("Giảm giá theo hình thức thanh toán: " + giamGiaThanhToan);

    double giamGiaKhuyenMai = (chuongTrinhKhuyenMai != null) ? chuongTrinhKhuyenMai.apDungKhuyenMai(tongTien) : 0;
    System.out.println("Giảm giá theo khuyến mãi: " + giamGiaKhuyenMai);

    double tongThanhToan = tongTien - giamGiaThanhToan - giamGiaKhuyenMai;
    System.out.println("Tổng số tiền cần thanh toán: " + tongThanhToan);
  }
}
