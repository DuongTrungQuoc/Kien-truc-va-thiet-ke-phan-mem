package B4_Composite_quanLiMonHoc;

public class Main {
  public static void main(String[] args) {
    KeHoachChung khoaHoc = new KeHoachChung("Khóa học Công nghệ thông tin");

    KeHoachChung nam1 = new KeHoachChung("Năm 1");
    KeHoachChung ky1 = new KeHoachChung("Kỳ 1");
    KeHoachChung ky2 = new KeHoachChung("Kỳ 2");

    ky1.add(new MonHoc("Lập trình Java", 3, 500000));
    ky1.add(new MonHoc("Toán rời rạc", 2, 300000));

    ky2.add(new MonHoc("Cấu trúc dữ liệu", 3, 500000));
    ky2.add(new MonHoc("Hệ điều hành", 2, 400000));


    nam1.add(ky1);
    nam1.add(ky2);

    khoaHoc.add(nam1);

    System.out.println(khoaHoc.thongTin());
    System.out.println("Tổng số tín chỉ: " + khoaHoc.getSoTC());
    System.out.println("Tổng học phí: " + khoaHoc.getHP());
  }

}
