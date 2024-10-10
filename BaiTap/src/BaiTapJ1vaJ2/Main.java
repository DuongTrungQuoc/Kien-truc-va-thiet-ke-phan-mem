package BaiTapJ1vaJ2;

public class Main {
  public static void main(String[] args) {
    System.out.println("--------------Bài tập J1--------------------");
    NhanVien nv1 = new NhanVien("Quốc",20,"20 Khu A",5000,50);
    NhanVien nv2 = new NhanVien("Phúc",20,"20 Khu B",10000,100);
    NhanVien nv3 = new NhanVien("Định",20,"20 Khu B",20000,200);
    System.out.println(nv1);
    System.out.println(nv2);
    System.out.println(nv3);
    System.out.println("--------------Bài tập J2--------------------");
    QuanLyNhanVien qlnv = new QuanLyNhanVien();
    qlnv.them(new NhanVien("Nguyễn A",23,"Nha Trang",15000,90));
    qlnv.them(new NhanVien("Nguyễn B",23,"Nha Trang",15000,120));
    qlnv.them(new NhanVien("Nguyễn C",23,"Nha Trang",15000,300));
    qlnv.them(new NhanVien("Nguyễn D",23,"Nha Trang",15000,300));
    qlnv.them(new NhanVien("Nguyễn E",23,"Nha Trang",15000,300));

    qlnv.inDS();
  }
}
