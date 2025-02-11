package f88;

public class MainClass {
  public static void main(String[] args) {
    NhanVienF88 nhanvien1 = new NhanVien("A","nhan vien quen",50000000);
    NhanVienF88 truongPhong = new NhanVien("B","truong phong",100000000);
    NhanVienF88 giamDoc = new NhanVien("C","giamDoc",150000000);
    NhanVienF88 chuTich = new ChuTich("D","chuTich",200000000);

    nhanvien1.capTren(truongPhong)
        .capTren(giamDoc)
        .capTren(chuTich);

    System.out.println(nhanvien1.duyetKhoanVay(250000000));
  }
}
