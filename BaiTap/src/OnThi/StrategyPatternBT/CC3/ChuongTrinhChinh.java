package OnThi.StrategyPatternBT.CC3;

public class ChuongTrinhChinh {
  public static void main(String[] args) {
    GioHang gioHang = new GioHang();

    // Thêm sản phẩm vào giỏ hàng
    gioHang.themSanPham(new SanPham("Sữa", 2, 250000));
    gioHang.themSanPham(new SanPham("Bánh", 3, 150000));
    gioHang.themSanPham(new SanPham("Gạo", 1, 1200000));

    // Chọn phương thức thanh toán
    gioHang.chonPhuongThucThanhToan(new ThanhToanAirpay());

    // Chọn chương trình khuyến mãi
    gioHang.chonChuongTrinhKhuyenMai(new KhuyenMaiPhanTram(5, 500000)); // Giảm 5%, tối đa 500k

    // Thanh toán
    gioHang.thanhToan();
  }
}
