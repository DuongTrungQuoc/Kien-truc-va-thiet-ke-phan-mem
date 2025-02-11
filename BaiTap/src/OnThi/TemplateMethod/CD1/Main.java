package OnThi.TemplateMethod.CD1;

import java.util.ArrayList;
import java.util.List;

// Lớp trừu tượng HoaDon
abstract class HoaDon {
  protected List<MatHang> dsHangHoa = new ArrayList<>();

  // Phương thức thêm mặt hàng
  public void themMatHang(MatHang matHang) {
    dsHangHoa.add(matHang);
  }

  // Phương thức tính tổng tiền (chưa tính chiết khấu)
  public double tinhTien() {
    double tongTien = 0;
    for (MatHang matHang : dsHangHoa) {
      tongTien += matHang.soLuong * matHang.donGia;
    }
    return tongTien;
  }

  // Phương thức trừu tượng để tính chiết khấu
  protected abstract double tinhChietKhau();

  // Phương thức hiển thị giỏ hàng
  public void hienThiGioHang() {
    System.out.println("\n--- Giỏ hàng ---");
    for (MatHang matHang : dsHangHoa) {
      System.out.printf("Tên: %s | Số lượng: %d | Đơn giá: %.2f | Thành tiền: %.2f\n",
          matHang.tenHang, matHang.soLuong, matHang.donGia, matHang.soLuong * matHang.donGia);
    }
    double tongTien = tinhTien();
    double chietKhau = tinhChietKhau();
    System.out.printf("Tổng tiền: %.2f\n", tongTien);
    System.out.printf("Chiết khấu: %.2f\n", chietKhau);
    System.out.printf("Tổng thanh toán: %.2f\n", tongTien - chietKhau);
  }
}

// Lớp mặt hàng
class MatHang {
  String tenHang;
  int soLuong;
  double donGia;

  public MatHang(String tenHang, int soLuong, double donGia) {
    this.tenHang = tenHang;
    this.soLuong = soLuong;
    this.donGia = donGia;
  }
}

// Khách hàng thân thiết
class KhachHangThanThiet extends HoaDon {
  @Override
  protected double tinhChietKhau() {
    double tongTien = tinhTien();
    return tongTien >= 500000 ? tongTien * 0.02 : 0;
  }
}

// Khách hàng vàng
class KhachHangVang extends HoaDon {
  @Override
  protected double tinhChietKhau() {
    double tongTien = tinhTien();
    if (tongTien >= 1000000) {
      return tongTien * 0.05;
    } else if (tongTien >= 500000) {
      return tongTien * 0.03;
    }
    return 0;
  }
}

// Khách hàng kim cương
class KhachHangKimCuong extends HoaDon {
  @Override
  protected double tinhChietKhau() {
    double tongTien = tinhTien();
    if (tongTien >= 1500000) {
      return tongTien * 0.06;
    } else if (tongTien >= 1000000) {
      return tongTien * 0.05;
    } else if (tongTien >= 500000) {
      return tongTien * 0.03;
    }
    return 0;
  }
}

// Lớp chạy chương trình
public class Main {
  public static void main(String[] args) {
    // Tạo hóa đơn khách hàng thân thiết
    HoaDon khachHang1 = new KhachHangThanThiet();
    khachHang1.themMatHang(new MatHang("Bánh", 2, 200000));
    khachHang1.themMatHang(new MatHang("Sữa", 1, 150000));
    khachHang1.hienThiGioHang();

    // Tạo hóa đơn khách hàng vàng
    HoaDon khachHang2 = new KhachHangVang();
    khachHang2.themMatHang(new MatHang("Điện thoại", 1, 1200000));
    khachHang2.themMatHang(new MatHang("Ốp lưng", 1, 200000));
    khachHang2.hienThiGioHang();

    // Tạo hóa đơn khách hàng kim cương
    HoaDon khachHang3 = new KhachHangKimCuong();
    khachHang3.themMatHang(new MatHang("Laptop", 1, 2000000));
    khachHang3.themMatHang(new MatHang("Chuột", 1, 500000));
    khachHang3.hienThiGioHang();
  }
}

